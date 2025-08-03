package com.tka.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.billDaoJPA;

@Service
public class billServiceImpl implements billService{
	
	@Autowired
	billDaoJPA billDao;

	

}
