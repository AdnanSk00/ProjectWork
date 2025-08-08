package com.tka.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tka.model.Match;

@Service
public interface matchService {

	String addMatch(Match match);

	List<Match> getAllMatches();

	Match getMatchById(int id);

	String deletematch(int id);

	String updateMatch(Match match);

	List<Match> getMatchByteamName(String team);
	
}
