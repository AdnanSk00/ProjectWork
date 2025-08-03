package com.tka.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tka.model.Product;

@Service
public interface productService {
	
	public String addProduct(Product product);

	public List<Product> getAllProduct();
	
	public Product getProductById(int id);

	public String updateProduct(Product product);

	public String deleteProduct(int id);

}