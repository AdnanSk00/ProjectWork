package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.ModelEntity.Product;
import com.tka.dao.productDaoJPA;

@Service
public class productServiceImpl implements productService{

	@Autowired
	productDaoJPA prodDao;
	
	@Override
	public String addProduct(Product product) {
		prodDao.save(product);
		return product.getProductName() + "added successfully...";
	}

	@Override
	public List<Product> getAllProduct() {
		return prodDao.findAll();
	}

	
}
