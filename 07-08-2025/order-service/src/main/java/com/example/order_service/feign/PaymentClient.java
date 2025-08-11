package com.example.order_service.feign;

import com.example.order_service.dto.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PAYMENT-SERVICE") // must match spring.application.name of payment-service
public interface PaymentClient {

    @GetMapping("/payment/{orderId}")
    Payment getPaymentByOrderId(@PathVariable("orderId") int orderId);
}
