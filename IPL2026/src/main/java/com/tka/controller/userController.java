package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tka.model.User;
import com.tka.service.userService;

@Controller
public class userController {
	
	@Autowired
	userService userSrvc;
	
	@PostMapping("/verify-login")
	public String doLogin(@ModelAttribute User user, Model model) {
		
		User dbUser = userSrvc.getUserByName(user.getUserName());
		
		if(dbUser != null) {
			if(user.getUserName().equals("Adnan") && user.getPass().equals("1230")) {	
				System.err.println("working bro...........");
				model.addAttribute("msgKeyLogin", "Login Successfully...");
				model.addAttribute("admin", "Ok");
				return "home";
			}
			else if(dbUser.getPass().equals(user.getPass())) {
				model.addAttribute("msgKeyLogin", "Login Successfully...");
				return "home";
			}
			else {
				model.addAttribute("wrongPass", "wrong password");
				return "login";
			}
		} else {
			model.addAttribute("loginError", "not_found");				
			model.addAttribute("worngUserNameOrPass", "wrong username or password");
			return "login";
		}
	}
	
	@PostMapping("/register-user")
	public String registerUser(@ModelAttribute User User, Model model) {
		String msg, userMsg;
		
		msg = "Registered successfully!";
		userMsg = userSrvc.insertUser(User);
		
		System.out.println("userName > " + User.getUserName());
		model.addAttribute("msgKeyRegister", msg);
		model.addAttribute("msgKeyUserInsert", userMsg);
		return "home";
	}
	
	@GetMapping("/logout")
	public String getLogout() {
		
		return "home";
	}
	
}
