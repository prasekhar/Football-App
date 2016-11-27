/**
 * 
 */
package com.mindtree.footballapp.model;

import java.util.Date;

/**
 * @author Banu Prakash
 * 
 */
public class Game {
	private int gameId;
	private Date matchDate;
	private String stadium;
	private Team firstTeam;
	private Team secondTeam;

	/**
	 * 
	 */
	public Game() {
	}

	/**
	 * @param gameId
	 * @param matchDate
	 * @param stadium
	 * @param firstTeam
	 * @param secondTeam
	 */
	public Game(int gameId, Date matchDate, String stadium, Team firstTeam,
			Team secondTeam) {
		this.gameId = gameId;
		this.matchDate = matchDate;
		this.stadium = stadium;
		this.firstTeam = firstTeam;
		this.secondTeam = secondTeam;
	}

	/**
	 * @return the gameId
	 */
	public int getGameId() {
		return gameId;
	}

	/**
	 * @param gameId
	 *            the gameId to set
	 */
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	/**
	 * @return the matchDate
	 */
	public Date getMatchDate() {
		return matchDate;
	}

	/**
	 * @param matchDate
	 *            the matchDate to set
	 */
	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

	/**
	 * @return the stadium
	 */
	public String getStadium() {
		return stadium;
	}

	/**
	 * @param stadium
	 *            the stadium to set
	 */
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	/**
	 * @return the firstTeam
	 */
	public Team getFirstTeam() {
		return firstTeam;
	}

	/**
	 * @param firstTeam
	 *            the firstTeam to set
	 */
	public void setFirstTeam(Team firstTeam) {
		this.firstTeam = firstTeam;
	}

	/**
	 * @return the secondTeam
	 */
	public Team getSecondTeam() {
		return secondTeam;
	}

	/**
	 * @param secondTeam
	 *            the secondTeam to set
	 */
	public void setSecondTeam(Team secondTeam) {
		this.secondTeam = secondTeam;
	}

}
