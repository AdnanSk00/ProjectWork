package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.playerDaoJPA;
import com.tka.model.Player;

@Service
public class playerServiceImpl implements playerService{

	@Autowired
	playerDaoJPA playerDao;

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
