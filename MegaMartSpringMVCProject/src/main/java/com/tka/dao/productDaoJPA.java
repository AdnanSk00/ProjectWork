package com.tka.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.ModelEntity.Product;

@Repository
public interface productDaoJPA extends JpaRepository<Product, Long> {


}
