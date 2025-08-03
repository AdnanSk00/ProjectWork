package com.tka.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tka.model.User;

@Service
public interface userService {

	String insertUser(User user);
	User getUserByName(String userName);
	List<User> getAllUser();
	void updateUser(User user);
	void deleteUser(User user);

}
