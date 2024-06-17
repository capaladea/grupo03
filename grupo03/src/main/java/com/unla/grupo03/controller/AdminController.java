package com.unla.grupo03.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unla.grupo03.model.User;
import com.unla.grupo03.repository.UserRepository;

@Controller
@RequestMapping("/admin/")
public class AdminController {
	
	@Autowired
	private UserRepository userRepo;
	
	@ModelAttribute
	private void userDetalles(Model m, Principal p) {
		
		if(p != null) {
		String email = p.getName();
		User admin = userRepo.findByEmail(email);
		m.addAttribute("user", admin);
	}

	}
	
	@GetMapping("/")
	public String home() {
		
		return "admin/home";
	}

}
