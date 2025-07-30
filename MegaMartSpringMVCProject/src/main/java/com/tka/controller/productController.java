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
	
	@GetMapping("/get-shop")
	public String getShop(Model model) {
		List<Product> productList = productSrvc.getAllProduct();
		model.addAttribute("productList", productList);
		return "shop";
	}
	
	@GetMapping("/add-to-cart/{id}")
	public String addToCart(@PathVariable int id, HttpSession session) {
	    List<Product> cartList = (List<Product>) session.getAttribute("cartList");
	    System.err.println("errr.." + cartList);
	    if (cartList == null) {
	        cartList = new ArrayList<>();
	    }
	    Product product = productSrvc.getProductById(id);
	    cartList.add(product);
	    System.err.println("errrsfsdfd" + cartList);
	    session.setAttribute("cartList", cartList);
	    return "redirect:/get-shop"; // ensures page reload
	}
	
	@GetMapping("/view-carts")
	public String viewCartsDetails(Model model, HttpSession session) {
		List<Product> cartList = (List<Product>) session.getAttribute("cartList");

	    if (cartList == null) {
	        cartList = new ArrayList<>();
	        session.setAttribute("cartList", cartList);
	    }
	    model.addAttribute("cartList", cartList);
	    return "cartsDetails";
	}

	@GetMapping("/remove-cart/{id}")
	public String removeCart(@PathVariable int id, HttpSession session) {
	    List<Product> cartList = (List<Product>) session.getAttribute("cartList");
	    if (cartList != null) {
	        cartList.removeIf(p -> p.getProductId() == id);
	        session.setAttribute("cartList", cartList);
	    }
	    return "redirect:/view-carts";
	}
	

}
