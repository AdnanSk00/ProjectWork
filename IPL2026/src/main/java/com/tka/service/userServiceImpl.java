package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.userDaoJPA;
import com.tka.model.User;

@Service
public class userServiceImpl implements userService{

	@Autowired
	userDaoJPA userDao;
	
	@Override
	public String insertUser(User user) {
		userDao.save(user);
		return user.getUserName() + " inserted successfully...";
	}

	@Override
	public User getUserByName(String userName) {
		return userDao.findByUserName(userName);
	}

	@Override
	public List<User> getAllUser() {
		List<User> userList = userDao.findAll();
		System.err.println("data get...");
		return userList;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

	
	

}
