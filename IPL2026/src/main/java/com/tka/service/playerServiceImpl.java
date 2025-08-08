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
	

	
	
//	@Override
//	public List<Product> getAllProduct() {
//	}
//
//	@Override
//	public Product getProductById(int id) {
//		return prodDao.getById(id);
//	}
//
//	@Override
//	public String updateProduct(Product product) {
//		Product addProduct = prodDao.save(product);
//		if(addProduct != null) {
//			return product.getProductName() + " updated successfully...";			
//		} else {
//			return product.getProductName() + " failed to update";
//		}
//	}
//
//	@Override
//	public String deleteProduct(int id) {
//		prodDao.deleteById(id);
//		return "product deleted successfully...";
//	}

	

	
}
