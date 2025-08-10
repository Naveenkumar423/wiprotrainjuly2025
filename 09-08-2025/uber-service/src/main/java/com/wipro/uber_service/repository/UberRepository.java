package com.wipro.uber_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.common.dto.Booking;

public interface UberRepository extends JpaRepository<Booking, Long> {}
