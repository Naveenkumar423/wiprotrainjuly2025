package com.example.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.entity.Product;
import com.example.project.repo.ProductRepo;
import com.example.project.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepo productRepo;

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		productRepo.save(product);
		
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}
	

}
