package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.ModelEntity.Customer;
import com.tka.ModelEntity.User;
import com.tka.dao.customerDaoJPA;
import com.tka.dao.userDaoJPA;

@Service
public class customerServiceImpl implements customerService {

	@Autowired
	customerDaoJPA custDao;
	
	@Autowired
	userDaoJPA userDao;
	
	@Override
	public String insertCustomer(Customer customer) {
		custDao.save(customer);
		return customer.getUserName() + " inserted successfully...";
	}

	@Override
	public Customer getCustomer(String userName) {
		Customer cust = custDao.findByUserName(userName);
		System.err.println("customer > " + cust);
		return cust;
	}
	
	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> customerList = custDao.findAll();
		System.err.println("data get...");
		return customerList;
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String insertUser(User user) {
		User getUser = userDao.findByUserName(user.getUserName());
		if(getUser == null) {
			userDao.save(user);
			return user.getUserName() + " inserted successfully...";
		} else {
			return user.getUserName() + " already inserted...";
		}
	}
	
	
}
