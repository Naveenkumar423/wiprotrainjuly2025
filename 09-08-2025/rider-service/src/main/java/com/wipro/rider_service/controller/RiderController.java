package com.wipro.rider_service.controller;

import com.wipro.common.dto.Booking;
import com.wipro.rider_service.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RiderController {

    private final BookingRepository repo;
    private final KafkaTemplate<String, Booking> kafkaTemplate;

    @PostMapping("/ride")
    public Booking createRide(@RequestBody Booking booking) {
        booking.setStatus("REQUESTED");
        booking.setCreatedAt(LocalDateTime.now());
        booking.setDriverName(null);
        booking.setVehicleNumber(null);
        booking.setFareAmount(BigDecimal.ZERO);

        Booking saved = repo.save(booking);
        kafkaTemplate.send("rider-to-uber", saved);
        System.out.println("Rider sent booking to Uber: " + saved);
        return saved;
    }

    @KafkaListener(topics = "uber-to-rider", groupId = "rider-group")
    public void handleUberResponse(Booking booking) {
        repo.findById(booking.getId()).ifPresent(b -> {
            b.setStatus(booking.getStatus());
            b.setDriverName(booking.getDriverName());
            b.setVehicleNumber(booking.getVehicleNumber());
            b.setFareAmount(booking.getFareAmount());
            repo.save(b);
            System.out.println("Rider updated booking from Uber: " + b);
        });
    }
}
