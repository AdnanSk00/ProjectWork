package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tka.model.Match;
import com.tka.model.Player;
import com.tka.service.matchService;
import com.tka.service.playerService;

@Controller
public class teamController {
	
	@Autowired
	playerService playerSrvc;
	
	@Autowired
	matchService matchService;
	
	@GetMapping("/{teamName}-home")
	public String getTeamHome(@PathVariable String teamName, Model model) {
		model.addAttribute("teamName", teamName.toUpperCase());  // e.g., CSK, RCB
		model.addAttribute("shortName", teamName.toLowerCase());
        model.addAttribute("teamFullName", getFullTeamName(teamName));
        model.addAttribute("logoPath", "/resources/images/teamLogo/" + teamName.toLowerCase() + ".svg");
		
		return "Team/home";
	}
	
	public String getFullTeamName(String shortName) {
		 switch (shortName.toLowerCase()) {
	        case "csk": return "Chennai Super Kings";
		    case "mi": return "Mumbai Indians";
		    case "rcb": return "Royal Challengers Bangalore";
		    case "srh": return "Sunrisers Hyderabad";
		    case "kkr": return "Kolkata Knight Riders";
		    case "rr": return "Rajasthan Royals";
		    case "dc": return "Delhi Capitals";
		    case "gt": return "Gujarat Titans";
		    case "lsg": return "Lucknow Super Giants";
		    case "pbks": return "Punjab Kings";
		    default: return "Unknown Team";
	    }
	}
	
	@GetMapping("/{teamName}-squad")
	public String getTeamSquade(@PathVariable String teamName, Model model) {
		System.err.println(teamName);
		
		List<Player> playerList = playerSrvc.getPlayerByteamName(teamName.toUpperCase());
		model.addAttribute("playerList", playerList);  // e.g., CSK, RCB

		model.addAttribute("teamName", teamName.toUpperCase());  // e.g., CSK, RCB
		model.addAttribute("shortName", teamName.toLowerCase());
		model.addAttribute("teamFullName", getFullTeamName(teamName));
		model.addAttribute("logoPath", "/resources/images/teamLogo/" + teamName.toLowerCase() + ".svg");
		
		return "Team/squad";
	}

	@GetMapping("/{teamName}-matches")
	public String getTeamMatches(@PathVariable String teamName, Model model) {
	    List<Match> matchList = matchService.getMatchByteamName(teamName.toUpperCase());
	    model.addAttribute("matchList", matchList);

	    model.addAttribute("shortName", teamName);
	    model.addAttribute("teamName", teamName.toUpperCase());
	    model.addAttribute("logoPath", "/resources/images/teamLogo/" + teamName.toLowerCase() + ".svg");
	    return "Team/matches"; // matches.jsp
	}

	
	
}