package com.wipro.rider_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.common.dto.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {}
