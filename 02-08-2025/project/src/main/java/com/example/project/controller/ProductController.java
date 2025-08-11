package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.Product;
import com.example.project.repo.ProductRepo;
import com.example.project.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductService productService;
	 @Autowired
	    private ProductRepo productRepo;
	@PostMapping
	void save(@RequestBody Product product)
	{
		
		productRepo.save(product);
		
		
	}

	@GetMapping
	List<Product> findAll()
	{
		return productRepo.findAll();
	}	
	

}
