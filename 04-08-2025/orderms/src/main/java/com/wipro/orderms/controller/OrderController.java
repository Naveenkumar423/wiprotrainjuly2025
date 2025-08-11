package com.wipro.orderms.controller;

import com.wipro.orderms.entity.Order;
import com.wipro.orderms.repo.OrderRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepo;

    private final String paymentUrl = "http://localhost:9011/payments";

    @PostMapping
    public ResponseEntity<String> createOrder(@RequestBody Order order) {
        order.setOrderStatus("I"); // Initial
        order = orderRepo.save(order);

        // Build payment request
        PaymentRequest payment = new PaymentRequest();
        payment.setOrderId(order.getId());
        payment.setPaymentStatus(true); // or false for failure

        try {
            RestTemplate rt = new RestTemplate();
            ResponseEntity<String> response = rt.postForEntity(paymentUrl, payment, String.class);

            if (response.getStatusCode() == HttpStatus.OK && "SUCCESS".equalsIgnoreCase(response.getBody())) {
                order.setOrderStatus("P"); // Paid
            } else {
                order.setOrderStatus("C"); // Cancelled
            }
        } catch (Exception e) {
            order.setOrderStatus("C"); // Cancelled due to exception
        }

        orderRepo.save(order);
        return ResponseEntity.ok("Order created with status: " + order.getOrderStatus());
    }

    @Data
    public static class PaymentRequest {
        private int orderId;
        private boolean paymentStatus;
    }
}
