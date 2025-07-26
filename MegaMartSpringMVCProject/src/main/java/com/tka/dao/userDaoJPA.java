package com.tka.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.ModelEntity.User;

@Repository
public interface userDaoJPA extends JpaRepository<User, Long> {

	User findByUserName(String userName);
}
