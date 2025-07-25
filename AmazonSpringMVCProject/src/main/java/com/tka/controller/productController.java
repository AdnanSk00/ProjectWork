package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tka.ModelEntity.Product;
import com.tka.service.productService;

@Controller
public class productController {
	
	@Autowired
	productService productSrvc;
	String msg;
	
	@PostMapping("/add-product")
	public String addProduct(@ModelAttribute Product product, Model model){
		msg = productSrvc.addProduct(product);
		model.addAttribute("msgKey", msg);
		return "home";
	}
	
	@GetMapping("/view-products")
	public String getAllProducts(Model model) {
		List<Product> productList = productSrvc.getAllProduct();
		model.addAttribute("productList", productList);
		return "allProductDetails";
	}
	
}
