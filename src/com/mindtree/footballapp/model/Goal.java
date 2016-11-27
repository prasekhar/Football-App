/**
 * 
 */
package com.mindtree.footballapp.model;

/**
 * @author Banu Prakash
 *
 */
public class Goal {

	private int matchId;
	private Team scoringTeam;
	private String player;
	private int goalTime;
	
	/**
	 * 
	 */
	public Goal() {
	}
	/**
	 * @param matchId
	 * @param scoringTeam
	 * @param player
	 * @param goalTime
	 */
	public Goal(int matchId, Team scoringTeam, String player, int goalTime) {
		this.matchId = matchId;
		this.scoringTeam = scoringTeam;
		this.player = player;
		this.goalTime = goalTime;
	}
	/**
	 * @return the matchId
	 */
	public int getMatchId() {
		return matchId;
	}
	/**
	 * @param matchId the matchId to set
	 */
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	/**
	 * @return the scoringTeam
	 */
	public Team getScoringTeam() {
		return scoringTeam;
	}
	/**
	 * @param scoringTeam the scoringTeam to set
	 */
	public void setScoringTeam(Team scoringTeam) {
		this.scoringTeam = scoringTeam;
	}
	/**
	 * @return the player
	 */
	public String getPlayer() {
		return player;
	}
	/**
	 * @param player the player to set
	 */
	public void setPlayer(String player) {
		this.player = player;
	}
	/**
	 * @return the goalTime
	 */
	public int getGoalTime() {
		return goalTime;
	}
	/**
	 * @param goalTime the goalTime to set
	 */
	public void setGoalTime(int goalTime) {
		this.goalTime = goalTime;
	}

	
}
