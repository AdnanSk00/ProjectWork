package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.matchDaoJPA;
import com.tka.model.Match;

@Service
public class matchServiceImpl implements matchService{

	@Autowired
	matchDaoJPA matchDao;

	@Override
	public String addMatch(Match match) {
		Match addMatch = matchDao.save(match);
		if(addMatch != null) {
			return match.getTeam() + " added successfully...";			
		} else {
			return match.getTeam() + " failed to add";
		} 
	}

	@Override
	public List<Match> getAllMatches() {
		return matchDao.findAll();
	}

	@Override
	public List<Match> getMatchByteamName(String team) {
		return matchDao.findByteam(team);
	}
	
	
	
//	@Override
//	public String addPlayer(Player player) {
//		Player addPlayer = playerDao.save(player);
//		if(addPlayer != null) {
//			return player.getPname() + " added successfully...";			
//		} else {
//			return player.getPname() + " failed to add";
//		} 
//	}
	
//	@Override
//	public List<Player> getAllPlayers() {
//		return playerDao.findAll();
//	}
//
//	@Override
//	public List<Player> getPlayerByteamName(String upperCase) {
//		return playerDao.findAll();
//	}
	
	
	
	
	

	
}
