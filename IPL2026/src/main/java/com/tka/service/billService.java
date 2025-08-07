package com.tka.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tka.model.Bill;

@Service
public interface billService {

	List<Bill> getAllOrders();

	void saveBill(Bill bill);
	
}
