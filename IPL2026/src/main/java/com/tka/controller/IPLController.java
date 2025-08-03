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
	
//	@GetMapping("/get-signup")
//	public String getSignUp() {
//		return "signup";
//	}
	
//	@GetMapping("/view-customer")			// In controller - Ambiguity
//	public String getAllCustomer(Model model) {
//		return "allCustomerDetails";
//	}
	
//	@GetMapping("/get-product")
//	public String getProductPage() {
//		return "addProduct";
//	}
	
//	@GetMapping("/view-products")
//	public String viewProductsDetails() {
//		return "allProductsDetails";
//	}
	
//	@GetMapping("/get-updateProduct")
//	public String getUpdate() {
//		return "update";
//	}
	
//	@GetMapping("/get-shop")
//	public String getShop() {
//		return "shopDetails";
//	}
	
//	@GetMapping("/view-carts")
//	public String viewCartsDetails() {
//		return "cartsDetails";
//	}
	
//	@GetMapping("/view-orders")
//	public String viewOrdersDetails() {
//		return "orders";
//	}
	
//	@GetMapping("/view-bills")
//	public String viewBillDetails() {
//		return "billDetails";
//	}
//	@GetMapping("/logout")
//	public String logout() {
//		return "logout";
//	}
	

}
