package com.tka.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.playerDaoJPA;
import com.tka.model.Player;

@Service
public class playerServiceImpl implements playerService{

	@Autowired
	playerDaoJPA playerDao;
	
	@Autowired
	SessionFactory sf;

	@Override
	public String addPlayer(Player player) {
		Player addPlayer = playerDao.save(player);
		if(addPlayer != null) {
			return player.getPname() + " added successfully...";			
		} else {
			return player.getPname() + " failed to add";
		} 
	}
//
	@Override
	public List<Player> getAllPlayers() {
		return playerDao.findAll();
	}
	
	@Override
	public Player getPlayerById(int id) {
		return playerDao.getById(id);
	}
	@Override
	public String updatePlayer(Player player) {
		Player addPlayer = playerDao.save(player);
		if(addPlayer != null) {
			return player.getPname() + " updated successfully...";			
		} else {
			return player.getPname() + " failed to update";
		}
	}
	@Override
	public String deletePlayer(int id) {
		playerDao.deleteById(id);
		return "player deleted successfully...";
	}

	
	
	@Override
	public List<Player> getPlayerByteamName(String pteamName) {
		return playerDao. findBypteamName(pteamName);
	}
	
	
	@Override
	public List<Player> getBattingStats() {
		Session ssn = sf.openSession();
		Criteria crt = ssn.createCriteria(Player.class);
		crt.addOrder(Order.desc("runs"));
		List<Player> battingList = crt.list();
		return battingList;
	}
	@Override
	public List<Player> getBowlingStats() {
		Session ssn = sf.openSession();
		Criteria crt = ssn.createCriteria(Player.class);
		crt.addOrder(Order.desc("wickets"));
		List<Player> bowlingList = crt.list();
		return bowlingList;
	}
	
	
	
}
