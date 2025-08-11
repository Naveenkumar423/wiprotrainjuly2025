package com.example.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
}