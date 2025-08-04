package com.tka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class teamController {
	
	@GetMapping("/csk-home")
	public String getHomeCSK() {
		return "CSK/home";
	}
	@GetMapping("/mi-home")
	public String getHomeMI() {
		return "MI/home";
	}
	@GetMapping("/rcb-home")
	public String getHomeRCB() {
		return "RCB/home";
	}
	@GetMapping("/pbks-home")
	public String getHomePBKS() {
		return "PBKS/home";
	}
	@GetMapping("/rr-home")
	public String getHomeRR() {
		return "RR/home";
	}
	@GetMapping("/dc-home")
	public String getHomeDC() {
		return "DC/home";
	}
	@GetMapping("/gt-home")
	public String getHomeGT() {
		return "GT/home";
	}
	@GetMapping("/kkr-home")
	public String getHomeKKR() {
		return "KKR/home";
	}
	@GetMapping("/srh-home")
	public String getHomeSRH() {
		return "SRH/home";
	}
	@GetMapping("/lsg-home")
	public String getHomeLSG() {
		return "LSG/home";
	}
	
	
}
