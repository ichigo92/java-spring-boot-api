package com.arx.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arx.api.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	Product findByName(String name);
	
}
