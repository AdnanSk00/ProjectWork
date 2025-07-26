package com.tka.p5UserJSPtoDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class webService {
	
	@Autowired
	webDao webDao;
	
	public List<User> getAllUser() {
		List<User> userList = webDao.getAllUser();
		return userList;
	}
	public String insertUser(User user) {
		return webDao.insertUser(user);
	}

	public String updateUser(User user) {
		return webDao.updateUser(user);
		
	}

	public String deleteUser(User user) {
		return webDao.deleteUser(user);
	}

	
}
