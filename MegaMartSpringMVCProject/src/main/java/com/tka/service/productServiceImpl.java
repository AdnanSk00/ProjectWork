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
		Product addProduct = prodDao.save(product);
		if(addProduct != null) {
			return product.getProductName() + " added successfully...";			
		} else {
			return product.getProductName() + " failed to add";
		}
	}

	@Override
	public List<Product> getAllProduct() {
		return prodDao.findAll();
	}

	@Override
	public Product getProductById(int id) {
		return prodDao.getById(id);
	}

	@Override
	public String updateProduct(Product product) {
		Product addProduct = prodDao.save(product);
		if(addProduct != null) {
			return product.getProductName() + " updated successfully...";			
		} else {
			return product.getProductName() + " failed to update";
		}
	}

	@Override
	public String deleteProduct(int id) {
		prodDao.deleteById(id);
		return "product deleted successfully...";
	}

	
}
