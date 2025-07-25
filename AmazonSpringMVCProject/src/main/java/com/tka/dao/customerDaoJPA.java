package com.tka.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.ModelEntity.Customer;

@Repository
public interface customerDaoJPA extends JpaRepository<Customer, Long> {

	Customer findByUserName(String userName);

}
