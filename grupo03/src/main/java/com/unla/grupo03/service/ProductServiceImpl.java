package com.unla.grupo03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.unla.grupo03.model.Product;
import com.unla.grupo03.repository.ProductRepository;

public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepo;
	
	
	@Override
	public List<Product> listar() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}
	
}
