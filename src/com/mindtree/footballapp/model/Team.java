/**
 * 
 */
package com.mindtree.footballapp.model;

/**
 * @author Banu Prakash
 *
 */
public class Team {

	private String teamId;
	
	private String teamName;
	
	private String coachName;

	/**
	 * 
	 */
	public Team() {
	}

	/**
	 * @param teamId
	 * @param teamName
	 * @param coachName
	 */
	public Team(String teamId, String teamName, String coachName) {
		this.teamId = teamId;
		this.teamName = teamName;
		this.coachName = coachName;
	}

	/**
	 * @return the teamId
	 */
	public String getTeamId() {
		return teamId;
	}

	/**
	 * @param teamId the teamId to set
	 */
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	/**
	 * @return the coachName
	 */
	public String getCoachName() {
		return coachName;
	}

	/**
	 * @param coachName the coachName to set
	 */
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	
	
}
