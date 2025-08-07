package com.tka.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.model.Match;

@Repository
public interface matchDaoJPA extends JpaRepository<Match, Integer> {

	List<Match> findByteam(String team);




}
