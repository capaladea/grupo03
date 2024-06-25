package com.unla.grupo03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.unla.grupo03.model.Productos;
import com.unla.grupo03.service.ProductosService;

public class ProductosController {

	@Autowired
	private ProductosService service;
	
	
	
	@GetMapping("/productos")
	public String productos() {		
		return "productos";
	}
	
}
