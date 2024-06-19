package com.unla.grupo03.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.unla.grupo03.model.Productos;


import com.unla.grupo03.model.User;
import com.unla.grupo03.service.AlertaFaltantesService;

import com.unla.grupo03.service.ProductosServiceImp;
import com.unla.grupo03.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller

public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/signin")
	public String login() {		
		return "login";
	}
	
	@GetMapping("/register")
	public String register() {		
		return "register";
	}

	
	@Autowired
	private ProductosServiceImp service;
	
	@ModelAttribute
	
	
	
	@GetMapping("/productos")
	
	private String traerProductos(Model model) {

		List<Productos> productos =service.listar();		
		
		model.addAttribute("productos", productos);
		
		return "/Productos";
	}
	
	@GetMapping("/productos")
	public String productos() {		
		return "productos";
	}
	
	
	
	@PostMapping("/createUser")
	public String createUser(@ModelAttribute User user, HttpSession session) {
		
		boolean check = userService.checkEmail(user.getEmail()) ;
		
		if(check) 			
			session.setAttribute("msg", "Ya existe el email");			
		else {
			
			User userAux = userService.createUser(user);
			
			if(userAux != null)
				session.setAttribute("msg", "Registro exitoso");
			else
				session.setAttribute("msg", "Algo salio mal");	
		}	
		return "redirect:/register";
	}
}
