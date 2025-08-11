package com.wipro.paymentms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.paymentms.entity.Payment;
import com.wipro.paymentms.repo.PaymentRepository;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentRepository repo;

    @PostMapping
    public String makePayment(@RequestBody Payment payment) {
        repo.save(payment);
        return payment.isPaymentStatus() ? "SUCCESS" : "FAILURE";
    }
}
