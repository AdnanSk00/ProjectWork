package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tka.model.Match;
import com.tka.model.Player;
import com.tka.model.Product;
import com.tka.model.User;
import com.tka.service.matchService;
import com.tka.service.playerService;
import com.tka.service.productService;
import com.tka.service.userService;

@Controller
public class AdminController {
	
	@Autowired
	userService userSrvc;
	String addMsg;
	String updMsg;
	String delMsg;
	
	@Autowired
	productService productSrvc;
	
	@Autowired
	playerService playerSrvc;
	
	@Autowired
	matchService matchSrvc;
	
	
	@GetMapping("/view-user")
	public String getAllUser(Model model) {
		List<User> userList = userSrvc.getAllUser();
		model.addAttribute("userList", userList);
		return "allUserDetails";
	}
	
	@GetMapping("/get-product")
	public String getProduct() {
		return "addProduct";
	}
	@PostMapping("/add-product")
	public String addProduct(@ModelAttribute Product product, Model model){
		product.setImgPath("/resources/images/product/" + product.productName.toLowerCase() + ".jpg");
		addMsg = productSrvc.addProduct(product);
		model.addAttribute("msgKey", addMsg);
		model.addAttribute("admin", "Ok");
		return "home";
	}
	@GetMapping("/view-products")
	public String getAllProducts(Model model) {
		List<Product> productList = productSrvc.getAllProduct();
		model.addAttribute("productList", productList);
		return "allProductDetails";
	}
	@GetMapping("/get-updateProduct/{id}")
	public String getUpdate(@PathVariable int id, Model model) {
		Product product = productSrvc.getProductById(id);
		model.addAttribute("product", product);
		return "update";
	}
	@PostMapping("/update-product")
	public String updateProduct(@ModelAttribute Product product, Model model) {
		product.setImgPath("/resources/images/" + product.productName.toLowerCase() + ".jpg");
		updMsg = productSrvc.updateProduct(product);
		model.addAttribute("updMsg", updMsg);
		return getAllProducts(model);
	}
	@GetMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id,  Model model) {
		delMsg = productSrvc.deleteProduct(id);
		model.addAttribute("delMsg", delMsg);
		return getAllProducts(model);
	}
	
	
	@GetMapping("/get-player")
	public String getPlayer() {
		return "addPlayer";
	}
	@PostMapping("/add-player")
	public String addPlayer(@ModelAttribute Player player, Model model){
		player.setImgPath("/resources/images/player/" + player.pname.toLowerCase() + ".png");
		addMsg = playerSrvc.addPlayer(player);
		model.addAttribute("msgKey", addMsg);
		model.addAttribute("admin", "Ok");
		return "home";
	}
	@GetMapping("/view-players")
	public String getAllPlayers(Model model) {
		List<Player> playerList = playerSrvc.getAllPlayers();
		model.addAttribute("playerList", playerList);
		return "allPlayerDetails";
	}
	
	
	@GetMapping("/get-match")
	public String getMatch() {
		return "addMatch";
	}
	@PostMapping("/add-match")
	public String addmatch(@ModelAttribute Match match, Model model){
		match.setTeamLogo("/resources/images/teamLogo/" + match.vsTeam.toLowerCase() + ".svg");
		addMsg = matchSrvc.addMatch(match);
		model.addAttribute("msgKey", addMsg);
		model.addAttribute("admin", "Ok");
		return "home";
	}
	@GetMapping("/view-matches")
	public String getAllMatches(Model model) {
		List<Match> matchList = matchSrvc.getAllMatches();
		model.addAttribute("matchList", matchList);
		System.err.println("mateeeee" + matchList);
		return "allMatchDetails";
	}
}
