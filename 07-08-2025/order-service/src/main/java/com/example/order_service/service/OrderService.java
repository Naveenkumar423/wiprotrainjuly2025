package com.example.order_service.service;

import com.example.order_service.entity.Order;
import com.example.order_service.repository.OrderRepository;
import com.example.order_service.wrapper.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Order placeOrder(Order order) {
        // Step 1: Save the order with Pending status
        order.setOrderStatus("P"); // P = Pending
        Order savedOrder = orderRepository.save(order);

        // Step 2: Prepare payment object
        Payment payment = new Payment();
        payment.setOrderId(savedOrder.getId());
        payment.setAmount(order.getAmount());

        // Step 3: Call payment-service
        Payment paymentResponse = restTemplate.postForObject(
                "http://PAYMENT-SERVICE/payment",
                payment,
                Payment.class
        );

        // Step 4: Update order status based on payment result
        if (paymentResponse != null && paymentResponse.isPaymentStatus()) {
            savedOrder.setOrderStatus("C"); // C = Completed
        } else {
            savedOrder.setOrderStatus("F"); // F = Failed
        }

        return orderRepository.save(savedOrder);
    }
}
