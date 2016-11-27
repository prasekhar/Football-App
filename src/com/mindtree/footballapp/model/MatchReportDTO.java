/**
 * 
 */
package com.mindtree.footballapp.model;

import java.util.Date;

/**
 * @author Banu Prakash
 *
 */
public class MatchReportDTO {

	private Date matchDate;
	
	private String firstTeam;
	
	private String secondTeam;
	
	private int firstTeamScore;
	
	private int secondTeamScore;
	
	private String stadium;

	/**
	 * 
	 */
	public MatchReportDTO() {
	}

	/**
	 * @param matchDate
	 * @param firstTeam
	 * @param secondTeam
	 * @param firstTeamScore
	 * @param secondTeamScore
	 */
	public MatchReportDTO(Date matchDate, String firstTeam, int firstTeamScore, String secondTeam,
			 int secondTeamScore) {
		this.matchDate = matchDate;
		this.firstTeam = firstTeam;
		this.secondTeam = secondTeam;
		this.firstTeamScore = firstTeamScore;
		this.secondTeamScore = secondTeamScore;
	}

	/**
	 * @return the matchDate
	 */
	public Date getMatchDate() {
		return matchDate;
	}

	/**
	 * @param matchDate the matchDate to set
	 */
	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

	/**
	 * @return the firstTeam
	 */
	public String getFirstTeam() {
		return firstTeam;
	}

	/**
	 * @param firstTeam the firstTeam to set
	 */
	public void setFirstTeam(String firstTeam) {
		this.firstTeam = firstTeam;
	}

	/**
	 * @return the secondTeam
	 */
	public String getSecondTeam() {
		return secondTeam;
	}

	/**
	 * @param secondTeam the secondTeam to set
	 */
	public void setSecondTeam(String secondTeam) {
		this.secondTeam = secondTeam;
	}

	/**
	 * @return the firstTeamScore
	 */
	public int getFirstTeamScore() {
		return firstTeamScore;
	}

	/**
	 * @param firstTeamScore the firstTeamScore to set
	 */
	public void setFirstTeamScore(int firstTeamScore) {
		this.firstTeamScore = firstTeamScore;
	}

	/**
	 * @return the secondTeamScore
	 */
	public int getSecondTeamScore() {
		return secondTeamScore;
	}

	/**
	 * @param secondTeamScore the secondTeamScore to set
	 */
	public void setSecondTeamScore(int secondTeamScore) {
		this.secondTeamScore = secondTeamScore;
	}

	/**
	 * @return the stadium
	 */
	public String getStadium() {
		return stadium;
	}

	/**
	 * @param stadium the stadium to set
	 */
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	
	
}
