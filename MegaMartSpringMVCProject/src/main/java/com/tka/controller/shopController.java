package com.tka.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tka.ModelEntity.Bill;
import com.tka.ModelEntity.Product;
import com.tka.service.billService;
import com.tka.service.productService;

@Controller
public class shopController {
	
	@Autowired
	billService billSrvc;
	
	@Autowired
	productService productSrvc;

	@GetMapping("/get-shop")
	public String getShop(Model model) {
		List<Product> productList = productSrvc.getAllProduct();
		model.addAttribute("productList", productList);
		return "shopDetails";
	}
	
	@GetMapping("/add-to-cart/{id}")
	public String addToCart(@PathVariable int id, HttpSession session) {
	    List<Product> cartList = (List<Product>) session.getAttribute("cartList");
	    if (cartList == null) {
	        cartList = new ArrayList<>();
	    }
	    Product product = productSrvc.getProductById(id);
	    cartList.add(product);
	    session.setAttribute("cartList", cartList);
	    System.err.println("cart aaraaaaaaa re" + cartList);
	    return "redirect:/get-shop"; 	// page reload
	}
	
	@GetMapping("/view-carts")
	public String viewCartsDetails(Model model, HttpSession session) {
		System.err.println("not working...");
		List<Product> cartList = (List<Product>) session.getAttribute("cartList");

	    if (cartList == null) {
	        cartList = new ArrayList<>();
	        session.setAttribute("cartList", cartList);
	    }
	    model.addAttribute("cartList", cartList);
	    System.err.println("Carrrrrrrrrrtiii" + cartList);
	    return "cartDetails";
	}

	@GetMapping("/remove-cart/{id}")
	public String removeCart(@PathVariable int id, HttpSession session) {
	    List<Product> cartList = (List<Product>) session.getAttribute("cartList");
	        cartList.removeIf(p -> p.getProductId() == id);
	        session.setAttribute("cartList", cartList);
	        
	    return "redirect:/view-carts";
	}
	
	@PostMapping("/buy-product")
	public String buyNow(@RequestParam("selectedIds") List<Integer> selectedIds, HttpSession session) {
	    List<Product> cartList = (List<Product>) session.getAttribute("cartList");
	    List<Product> selectedProducts = new ArrayList<>();

	    if (cartList != null) {
	        for (Product p : cartList) {
	            if (selectedIds.contains(p.getProductId())) {
	                selectedProducts.add(p);
	            }
	        }
	    }

	    double total = selectedProducts.stream().mapToDouble(Product::getPrice).sum();

	    Bill bill = new Bill();
	    bill.setBillId((int) (Math.random() * 255555));
	    bill.setTotalAmount(total);

	    // Assign this bill to each product
	    for (Product p : selectedProducts) {
	        p.setBill(bill); // Set FK
	    }

	    bill.setProducts(selectedProducts); // Set list of products in bill

	    billSrvc.saveBill(bill);

	    session.setAttribute("lastBill", selectedProducts);
	    session.setAttribute("orderList", selectedProducts);

	    return "redirect:/bill-details";
	}
	
//	@PostMapping("/buy-product")
//	public String buyNow(@RequestParam("selectedIds") List<Integer> selectedIds, HttpSession session, Model model) {
//	    List<Product> cartList = (List<Product>) session.getAttribute("cartList");
//	    List<Product> selectedProducts = new ArrayList<>();
//	    
//	    if (cartList != null) {
//	        for (Product p : cartList) {
//	            if (selectedIds.contains(p.getProductId())) {
//	                selectedProducts.add(p);
//	            }
//	        }
//	    }
//
//	    session.setAttribute("lastBill", selectedProducts);  // Save latest bill for billDetails.jsp
//
//	    // Add to order history
//	    List<Product> orderList = (List<Product>) session.getAttribute("orderList");
//	    if (orderList == null) {
//	        orderList = new ArrayList<>();
//	    }
//	    orderList.addAll(selectedProducts);
//	    session.setAttribute("orderList", orderList);
//
//	    return "redirect:/bill-details";
//	}
	
	@GetMapping("/bill-details")
	public String getBillDetails(HttpSession session, Model model) {
	    List<Product> billList = (List<Product>) session.getAttribute("lastBill");
	    
	    model.addAttribute("billList", billList);

	    Bill bill = new Bill();
	    bill.setBillId((int) (Math.random()*255555));
	    
	    double total = 0;
	    if (billList != null) {
	        for (Product p : billList) {
	            total += p.getPrice();
	        }
	    }
	    bill.setTotalAmount(total);
	    
	    model.addAttribute("orderId", bill.getBillId());
	    model.addAttribute("totalAmount", bill.getTotalAmount());
	    
	    return "billDetails";  // JSP file
	}

	
	@GetMapping("/buy-product/{id}")
	public String buyNow(@PathVariable int id,  Model model, HttpSession session) {
		
		Product product = productSrvc.getProductById(id);
		List<Product> billList = new ArrayList<>();
		billList.add(product);
		
		Bill bill = new Bill();
		bill.setBillId((int) (Math.random()*255555));
		
		List<Product> orderList = (List<Product>) session.getAttribute("orderList");
		 if (orderList == null) {
		        orderList = new ArrayList<>();
		    }
		orderList.addAll(billList);
		session.setAttribute("orderList", orderList);

		model.addAttribute("billList", billList);
		model.addAttribute("orderList", orderList);
		model.addAttribute("orderId", bill.getBillId());
		model.addAttribute("totalAmount", product.getPrice());
		return "billDetails";
	}
	
//	@GetMapping("/view-orders")
//	public String getAllOrders(Model model, HttpSession session) {
//		List<Bill> orderList = billSrvc.getAllOrders();
//	    
//		return "orderDetails";
//	}
	@GetMapping("/view-orders")
	public String getAllOrders(Model model) {
	    List<Bill> orderList = billSrvc.getAllOrders(); // Fetch all bills
	    model.addAttribute("bills", orderList);
	    return "orderDetails";
	}

}