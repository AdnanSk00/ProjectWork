package com.tka.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.billDaoJPA;
import com.tka.model.Bill;

@Service
public class billServiceImpl implements billService{
	
	@Autowired
	billDaoJPA billDao;

	@Override
	public List<Bill> getAllOrders() {
		return billDao.findAll();
	}
	
	@Override
	public void saveBill(Bill bill) {
	    billDao.save(bill); // save bill & products (cascade saves product too)		
	}

}
