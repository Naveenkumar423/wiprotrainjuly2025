package com.wipro.uber_service.listener;

import com.wipro.common.dto.Booking;
import com.wipro.uber_service.repository.UberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UberListener {

    private final UberRepository repo;
    private final KafkaTemplate<String, Booking> kafkaTemplate;

    @KafkaListener(topics = "rider-to-uber", groupId = "uber-group")
    public void receiveBooking(Booking booking) {
        booking.setStatus("ACCEPTED");
        booking.setDriverName("John Doe");
        booking.setVehicleNumber("KA01AB1234");
        booking.setFareAmount(new BigDecimal("350.50"));
        booking.setCreatedAt(LocalDateTime.now());

        repo.save(booking);
        kafkaTemplate.send("uber-to-rider", booking);
        System.out.println("Uber processed booking and sent back: " + booking);
    }
}
