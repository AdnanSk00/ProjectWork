package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.matchDaoJPA;
import com.tka.model.Match;
import com.tka.model.Product;

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
	public Match getMatchById(int id) {
		return matchDao.getById(id);
	}

	@Override
	public String updateMatch(Match match) {
		Match addMatch = matchDao.save(match);
		if(addMatch != null) {
			return "Match updated successfully...";			
		} else {
			return match.getTeam() + "Match failed to update";
		}
	}
	
	@Override
	public String deletematch(int id) {
		matchDao.deleteById(id);
		return "Match deleted successfully...";

	}
	
	
	@Override
	public List<Match> getMatchByteamName(String team) {
		return matchDao.findByteam(team);
	}


	
}
