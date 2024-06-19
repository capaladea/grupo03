package com.unla.grupo03.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unla.grupo03.model.Stock;
import com.unla.grupo03.service.StockService;

@Controller
@RequestMapping("user/stock")
public class StockController {
private StockService service;
	
	@ModelAttribute
	@GetMapping({"", "/"})
	private String listarProduct(Model model) {

		List<Stock> stock = service.listar();
		model.addAttribute("stock", stock);
		
		return "user/stock";
	}
}
