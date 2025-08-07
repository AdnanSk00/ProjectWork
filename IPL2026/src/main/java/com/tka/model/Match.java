package com.tka.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "matches")	  // to avoid reserved keyword
public class Match {
	
	@Id
    public int matchNo;
	public String team;
	public String vsTeam;
    public String location;
    public String date;
    public String time;
    public String status;
    public String teamLogo;
    
   public Match() {

   } 
   
	public int getMatchNo() {
		return matchNo;
	}
	public void setMatchNo(int matchNo) {
		this.matchNo = matchNo;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getVsTeam() {
		return vsTeam;
	}
	public void setVsTeam(String vsTeam) {
		this.vsTeam = vsTeam;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTeamLogo() {
		return teamLogo;
	}
	public void setTeamLogo(String teamLogo) {
		this.teamLogo = teamLogo;
	}

	@Override
	public String toString() {
		return "Match [matchNo=" + matchNo + ", team=" + team + ", vsTeam=" + vsTeam + ", location=" + location
				+ ", date=" + date + ", time=" + time + ", status=" + status + ", teamLogo=" + teamLogo + "]";
	}
    
	
}
