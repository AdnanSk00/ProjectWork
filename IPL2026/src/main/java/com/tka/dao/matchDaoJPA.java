package com.tka.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tka.model.Match;

@Repository
public interface matchDaoJPA extends JpaRepository<Match, Integer> {

	List<Match> findByteam(String team);
//
//	List<Match> findByvsTeam(String vsTeam);
	
//	@Query("SELECT DISTINCT m FROM Match m WHERE m.team = :team OR m.vsTeam = :team")
//	List<Match> findByTeamOrVsTeam(@Param("team") String team);





}
