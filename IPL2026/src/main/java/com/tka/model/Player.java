package com.tka.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Player {
	
	@Id
	public int pid;
	public String pname;
	public String role;
	public int runs;
	public int wickets;
	public String pteamName;
	public String imgPath;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getPteamName() {
		return pteamName;
	}

	public void setPteamName(String pteamName) {
		this.pteamName = pteamName;
	}
	
	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	@Override
	public String toString() {
		return "Player [pid=" + pid + ", pname=" + pname + ", role=" + role + ", runs=" + runs + ", wickets=" + wickets
				+ ", pteamName=" + pteamName + "]";
	}

}
