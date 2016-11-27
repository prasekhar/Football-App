/**
 * 
 */
package com.mindtree.footballapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mindtree.footballapp.exceptions.DaoException;
import com.mindtree.footballapp.model.Game;
import com.mindtree.footballapp.model.Goal;
import com.mindtree.footballapp.model.MatchReportDTO;
import com.mindtree.footballapp.model.Team;

/**
 * @author Banu Prakash
 * 
 *         implementation classes for FootballLeagueDao interface for CRUD
 */
public class FootballLeagueDaoJdbcImpl implements FootballLeagueDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mindtree.footballapp.dao.FootballLeagueDao#getAllTeams()
	 */
	@Override
	public List<Team> getAllTeams() throws DaoException {
		List<Team> teams = new ArrayList<>();
		Connection con = DBUtil.getConnection();
		Statement stmt = null;
		String SQL = "select TEAM_ID, TEAM_NAME, COACH from team";
		try {
			stmt = con.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				Team team = new Team(rs.getString("TEAM_ID"),
						rs.getString("TEAM_NAME"), rs.getString("COACH"));
				teams.add(team);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DaoException("unable to get  team information ", e);
		} finally {
			DBUtil.releaseResource(stmt);
			DBUtil.releaseResource(con);
		}
		return teams;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mindtree.footballapp.dao.FootballLeagueDao#addGoalInfo(com.mindtree
	 * .footballapp.model.Goal)
	 */
	@Override
	public void addGoalInfo(Goal goal) throws DaoException {
		Connection con = DBUtil.getConnection();
		PreparedStatement stmt = null;
		String SQL = "insert into GOAL (MATCH_ID, SCORING_TEAM_ID, PLAYER, GOAL_TIME) values (?, ?, ?, ?)";
		try {
			stmt = con.prepareStatement(SQL);
			stmt.setInt(1, goal.getMatchId());
			stmt.setString(2, goal.getScoringTeam().getTeamId());
			stmt.setString(3, goal.getPlayer());
			stmt.setInt(4, goal.getGoalTime());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DaoException("unable to add  goal data ", e);
		} finally {
			DBUtil.releaseResource(stmt);
			DBUtil.releaseResource(con);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mindtree.footballapp.dao.FootballLeagueDao#getMatchReport()
	 */
	@Override
	public List<MatchReportDTO> getMatchReport() throws DaoException {
		List<MatchReportDTO> matchReport = new ArrayList<>();
		Connection con = DBUtil.getConnection();
		Statement stmt = null;
		String SQL = "SELECT MATCH_DATE, STADIUM, FIRST_TEAM, "
				+ " sum(CASE WHEN SCORING_TEAM_ID=FIRST_TEAM THEN 1 ELSE 0 END) FIRST_TEAM_SCORE,  SECOND_TEAM,   "
				+ " sum(case when SCORING_TEAM_ID=SECOND_TEAM then 1 else 0 end) SECOND_TEAM_SCORE "
				+ " FROM game JOIN goal ON GAME_ID = MATCH_ID  "
				+ " group by MATCH_ID order by MATCH_DATE,MATCH_ID,FIRST_TEAM,SECOND_TEAM;";
		try {
			stmt = con.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery(SQL);
			while (rs.next()) {

				MatchReportDTO report = new MatchReportDTO(
						rs.getDate("MATCH_DATE"), rs.getString("FIRST_TEAM"),
						rs.getInt("FIRST_TEAM_SCORE"),
						rs.getString("SECOND_TEAM"),
						rs.getInt("SECOND_TEAM_SCORE"));
				report.setStadium(rs.getString("STADIUM"));
				matchReport.add(report);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DaoException("unable to get  match report information ",
					e);
		} finally {
			DBUtil.releaseResource(stmt);
			DBUtil.releaseResource(con);
		}
		return matchReport;
	}

	@Override
	public List<Game> getAllGames() throws DaoException {
		List<Game> games = new ArrayList<>();
		Connection con = DBUtil.getConnection();
		Statement stmt = null;
		String SQL = "select GAME_ID, MATCH_DATE,STADIUM   from GAME";
		try {
			stmt = con.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				Game game = new Game(rs.getInt("GAME_ID"),
						rs.getDate("MATCH_DATE"), rs.getString("stadium"),
						null, null);
				games.add(game);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DaoException("unable to get  team information ", e);
		} finally {
			DBUtil.releaseResource(stmt);
			DBUtil.releaseResource(con);
		}
		return games;
	}

}
