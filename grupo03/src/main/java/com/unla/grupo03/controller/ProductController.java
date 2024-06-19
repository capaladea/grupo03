package com.unla.grupo03.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unla.grupo03.model.Product;
import com.unla.grupo03.service.ProductService;

@Controller
@RequestMapping("user/productos")
public class ProductController {
	private ProductService service;
	
	@ModelAttribute
	@GetMapping({"", "/"})
	private String listarProduct(Model model) {

		List<Product> productos = service.listar();
		model.addAttribute("productos", productos);
		
		return "user/productos";
	}
}
