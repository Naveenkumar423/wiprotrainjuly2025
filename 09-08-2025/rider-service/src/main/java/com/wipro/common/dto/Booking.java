package com.wipro.common.dto;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rider_id", nullable = false)
    private Long riderId;

    @Column(name = "pickup_location", nullable = false)
    private String pickupLocation;

    @Column(name = "drop_location", nullable = false)
    private String dropLocation;

    @Column(name = "status")
    private String status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "driver_name")
    private String driverName;

    @Column(name = "vehicle_number")
    private String vehicleNumber;

    @Column(name = "fare_amount", precision = 10, scale = 2)
    private BigDecimal fareAmount;
}
