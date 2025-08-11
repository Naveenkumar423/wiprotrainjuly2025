package com.example.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.entity.Order;
import com.example.project.repo.OrderRepo;
import com.example.project.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderRepo orderRepo;
	
	@Override
	public void save(Order order) {
		// TODO Auto-generated method stub
		orderRepo.save(order);
	}

	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return orderRepo.findAll();
	}

}
