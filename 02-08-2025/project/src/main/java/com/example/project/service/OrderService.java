package com.example.project.service;

import java.util.List;

import com.example.project.entity.Order;

public interface OrderService {
	void save(Order order);
	List<Order> findAll();
}
