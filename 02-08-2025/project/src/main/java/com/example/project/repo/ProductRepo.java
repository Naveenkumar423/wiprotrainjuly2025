package com.example.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

	
}
