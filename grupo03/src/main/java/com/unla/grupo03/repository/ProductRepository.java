package com.unla.grupo03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unla.grupo03.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
}
