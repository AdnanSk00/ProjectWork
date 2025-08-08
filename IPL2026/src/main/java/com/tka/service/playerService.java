package com.tka.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tka.model.Player;

@Service
public interface playerService {
	
	String addPlayer(Player player);
	
	List<Player> getAllPlayers();
	
	List<Player> getPlayerByteamName(String teamName);

	List<Player> getBattingStats();

	List<Player> getBowlingStats();

	
	
	
	
	
}
