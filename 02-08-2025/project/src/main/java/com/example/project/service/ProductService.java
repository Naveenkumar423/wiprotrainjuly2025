package com.example.project.service;

import com.example.project.entity.Product;
import java.util.List;

public interface ProductService {
	void save(Product product);
	List<Product> findAll();
}
