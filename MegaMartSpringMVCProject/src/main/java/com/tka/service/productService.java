package com.tka.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tka.ModelEntity.Product;

@Service
public interface productService {
	
	public String addProduct(Product product);

	public List<Product> getAllProduct();

}