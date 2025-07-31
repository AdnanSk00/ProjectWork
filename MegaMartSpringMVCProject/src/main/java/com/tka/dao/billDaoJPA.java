package com.tka.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.ModelEntity.Bill;

@Repository
public interface billDaoJPA extends JpaRepository<Bill, Integer>{

}
