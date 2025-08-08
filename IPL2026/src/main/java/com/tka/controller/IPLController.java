package com.tka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IPLController {
	
	@GetMapping("/")
	String getHome(Model model) {
		return "home";
	}
	
	@GetMapping("/get-login")
	public String getLogin() {
		return "login";
	}
	
}
