package com.tka.controller;

import javax.servlet.http.HttpSession;

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
	public String doLogin(@ModelAttribute User user, Model model, HttpSession session){
		
		User dbUser = userSrvc.getUserByName(user.getUserName());
		
		if(dbUser != null) {
			if(user.getUserName().equals("Adnan") && user.getPass().equals("1230")) {	
				session.setAttribute("loggedInUser", "Adnan"); // session for admin
				System.err.println("working bro...........");
				model.addAttribute("msgKeyLogin", "Login Successfully...");
				model.addAttribute("admin", "Ok");
				model.addAttribute("redirectAfterDelay1", true);
				return "home";
			}
			else if(dbUser.getPass().equals(user.getPass())) {
				session.setAttribute("loggedInUser", dbUser.getUserName()); // set session attribute
				model.addAttribute("msgKeyLogin", "Login Successfully...");
				model.addAttribute("redirectAfterDelay1", true);
				return "login";
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
	public String registerUser(@ModelAttribute User user, Model model) throws InterruptedException {
		String userMsg;
		
		userMsg = userSrvc.insertUser(user);
		
		System.out.println("userName > " + user.getUserName());
		model.addAttribute("msgKeyRegister", "Registered successfully...!");
		model.addAttribute("redirectAfterDelay2", true);
		
		return "home";
	}
	
	@GetMapping("/logout")
	public String getLogout(HttpSession session, Model model) {
	    session.invalidate(); // remove session
	    model.addAttribute("msgKeyLogout", "Login Successfully...");
//	    return "redirect:/";
	    return "home";
	}
	
}
