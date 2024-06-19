package com.unla.grupo03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.unla.grupo03.model.Productos;
import com.unla.grupo03.repository.ProductosRepository;



public class ProductosServiceImp {

	
	@Autowired
	private ProductosRepository datos;
	

	public List<Productos> listar() {
				
		System.out.println(datos.findAll());
		
		return (List<Productos>) datos.findAll();
	}
}
