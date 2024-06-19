package com.unla.grupo03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unla.grupo03.model.Productos;

import com.unla.grupo03.repository.ProductosRepository;



@Service
public class ProductosServiceImp  implements ProductosService{


	@Autowired
	private ProductosRepository datos;






	
}
