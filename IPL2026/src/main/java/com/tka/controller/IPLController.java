package com.tka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IPLController {
	
	@GetMapping("/")
	String getHome() {
		return "home";
	}
	
	@GetMapping("/get-login")
	public String getLogin() {
		return "login";
	}
	

}
