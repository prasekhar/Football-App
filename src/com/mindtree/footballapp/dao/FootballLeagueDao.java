/**
 * 
 */
package com.mindtree.footballapp.dao;

import java.util.List;

import com.mindtree.footballapp.exceptions.DaoException;
import com.mindtree.footballapp.model.Game;
import com.mindtree.footballapp.model.Goal;
import com.mindtree.footballapp.model.MatchReportDTO;
import com.mindtree.footballapp.model.Team;

/**
 * @author Banu Prakash
 * 
 *         interface for required CRUD operations on database
 */
public interface FootballLeagueDao {
	
	/**
	 * 
	 * @return all teams
	 * @throws DaoException
	 */
	public List<Team> getAllTeams() throws DaoException;
	
	/**
	 * 
	 * @return all games
	 * @throws DaoException
	 */
	public List<Game> getAllGames() throws DaoException;
	
	/**
	 * 
	 * @param goal goal to be added
	 * @throws DaoException
	 */
	public void addGoalInfo(Goal goal) throws DaoException;
	
	/**
	 * 
	 * @return match details
	 * @throws DaoException
	 */
	public List<MatchReportDTO> getMatchReport() throws DaoException;
	
}
