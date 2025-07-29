package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tka.ModelEntity.Customer;
import com.tka.ModelEntity.User;
import com.tka.service.customerService;

@Controller
public class customerController {

	@Autowired
	customerService custSrvc;
	
	@PostMapping("/verify-login")
	public String doLogin(@ModelAttribute User user, Model model) {
		String msg, userMsg;

		Customer cust = custSrvc.getCustomer(user.getUserName());

		if(cust != null) {
			msg = "Login Successfully...";
			userMsg = custSrvc.insertUser(user);
			
			model.addAttribute("msgKeyLogin", msg);
			model.addAttribute("msgKeyUserInsert", userMsg);
			return "home";
		} else {
			model.addAttribute("userUserName", user.getUserName());
			model.addAttribute("loginError", "not_found");
			return "login";
		}

	}

	@PostMapping("/register-user")
	public String registerUser(@ModelAttribute Customer customer, Model model) {
		String msg, custMsg;
		
		msg = "Registered successfully!";
		custMsg = custSrvc.insertCustomer(customer);
		
		System.out.println("userName > " + customer.getUserName());
		model.addAttribute("custUserName", customer.getUserName());
		model.addAttribute("msgKeyRegister", msg);
		model.addAttribute("msgKeyCustInsert", custMsg);
		return "home";
	}
	
	@GetMapping("/view-customer")
	public String getAllCustomer(Model model) {
		List<Customer> customerList = custSrvc.getAllCustomer();
		model.addAttribute("customerList", customerList);
//		return "sampleJSP";
		return "allCustomerDetails";
	}
	
}
