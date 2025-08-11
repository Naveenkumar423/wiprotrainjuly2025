package com.wipro.carservice.repository;

import com.wipro.carservice.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
