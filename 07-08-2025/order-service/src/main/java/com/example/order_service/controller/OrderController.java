package com.example.order_service.controller;

import com.example.order_service.dto.OrderResponse;
import com.example.order_service.dto.Payment;
import com.example.order_service.entity.Order;
import com.example.order_service.feign.PaymentClient;
import com.example.order_service.repository.OrderRepository;
import com.example.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private PaymentClient paymentClient; // ✅ Feign client injected

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.placeOrder(order);
    }

    @GetMapping("/all")
    public List<OrderResponse> getAllOrdersWithPayments() {
        List<Order> orders = orderRepository.findAll();
        List<OrderResponse> responseList = new ArrayList<>();

        for (Order order : orders) {
            OrderResponse response = new OrderResponse();
            response.setId(order.getId());
            response.setOrderNumber(order.getOrderNumber());
            response.setOrderValue(order.getOrderValue());
            response.setOrderStatus(order.getOrderStatus());

            try {
                Payment payment = paymentClient.getPaymentByOrderId(order.getId());
                response.setPayment(payment);
            } catch (Exception e) {
                response.setPayment(null);
            }

            responseList.add(response);
        }

        return responseList;
    }
}
