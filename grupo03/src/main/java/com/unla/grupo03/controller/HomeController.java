package com.unla.grupo03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.unla.grupo03.model.User;
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
		
		//System.out.println(" intento login");
		
		return "login";
	}
	
	@GetMapping("/register")
	public String register() {
		
		return "register";
	}
	
	@PostMapping("/createUser")
	public String createUser(@ModelAttribute User user, HttpSession session) {
		
		boolean check = userService.checkEmail(user.getEmail()) ;
		
		if(check) 			
			session.setAttribute("msg", "Ya existe el email");			
		else {
			
			User userAux = userService.createUser(user);
			
			System.out.println(userAux.toString());
						
			if(userAux!=null)
				session.setAttribute("msg", "Registro exitoso");
			else
				session.setAttribute("msg", "Algo salio mal");	
		}	
		return "redirect:/register";
	}
}
