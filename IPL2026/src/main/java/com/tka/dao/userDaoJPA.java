package com.tka.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.model.User;

@Repository
public interface userDaoJPA extends JpaRepository<User, Integer> {

	User findByUserName(Object object);
	
}
