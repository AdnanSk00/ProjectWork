package com.tka.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tka.ModelEntity.Customer;
import com.tka.ModelEntity.User;

@Service
public interface customerService {

	String insertCustomer(Customer customer);
	Customer getCustomer(String userName);
	List<Customer> getAllCustomer();
	void updateCustomer(Customer customer);
	void deleteCustomer(Customer customer);
	
	String insertUser(User user);

}
