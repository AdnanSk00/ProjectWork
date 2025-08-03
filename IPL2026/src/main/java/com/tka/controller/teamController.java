package com.tka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class teamController {
	
	@GetMapping("/rcb-home")
	public String getHome() {
		
		return "RCB/home";
	}
	
	
}
