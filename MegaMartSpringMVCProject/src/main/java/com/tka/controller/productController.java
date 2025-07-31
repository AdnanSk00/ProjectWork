package com.tka.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

import com.tka.ModelEntity.Product;
import com.tka.service.productService;

@Controller
public class productController {
	
	@Autowired
	productService productSrvc;
	String addMsg;
	String updMsg;
	String delMsg;
	
	@GetMapping("/")
	public String getHomePage(Model model) {
		List<Product> productList = productSrvc.getAllProduct();
		model.addAttribute("productList", productList);
		return "home";
	}
	
	@PostMapping("/add-product")
	public String addProduct(@ModelAttribute Product product, Model model){
		product.setImgPath("/resources/images/" + product.productName.toLowerCase() + ".jpg");
		addMsg = productSrvc.addProduct(product);
		model.addAttribute("msgKey", addMsg);
		return "home";
	}
	
	@GetMapping("/view-products")
	public String getAllProducts(Model model) {
		List<Product> productList = productSrvc.getAllProduct();
		model.addAttribute("productList", productList);
		return "allProductDetails";
	}
	
	@GetMapping("/get-updateProduct/{id}")
	public String getUpdate(@PathVariable int id, Model model) {
		Product product = productSrvc.getProductById(id);
		model.addAttribute("product", product);
		return "update";
	}
	
	@PostMapping("/update-product")
	public String updateProduct(@ModelAttribute Product product, Model model) {
		product.setImgPath("/resources/images/" + product.productName.toLowerCase() + ".jpg");
		updMsg = productSrvc.updateProduct(product);
		model.addAttribute("updMsg", updMsg);
		return getAllProducts(model);
	}
	
	@GetMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id,  Model model) {
		System.err.println("id + ..." + id);
		delMsg = productSrvc.deleteProduct(id);
		model.addAttribute("delMsg", delMsg);
		return getAllProducts(model);
	}

}
