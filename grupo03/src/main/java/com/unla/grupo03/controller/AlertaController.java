package com.unla.grupo03.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unla.grupo03.model.AlertaFaltantes;

import com.unla.grupo03.service.AlertaFaltantesService;

@Controller
@RequestMapping("admin/listar")
public class AlertaController {
	
	@Autowired
	private AlertaFaltantesService service;
	
	@ModelAttribute
	@GetMapping({"", "/"})
	private String listarAlertas(Model model) {

		List<AlertaFaltantes> alertas = service.listar();
		model.addAttribute("alertas", alertas);
		
		return "admin/listar";
	}

}

