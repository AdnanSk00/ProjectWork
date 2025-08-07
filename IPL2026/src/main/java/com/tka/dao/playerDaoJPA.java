package com.tka.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.model.Player;

@Repository
public interface playerDaoJPA extends JpaRepository<Player, Integer> {

	List<Player> findBypteamName(String pteamName);



}
