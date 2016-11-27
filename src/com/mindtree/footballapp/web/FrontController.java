package com.mindtree.footballapp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindtree.footballapp.dao.FootballLeagueDao;
import com.mindtree.footballapp.dao.FootballLeagueDaoJdbcImpl;
import com.mindtree.footballapp.exceptions.DaoException;
import com.mindtree.footballapp.model.Goal;
import com.mindtree.footballapp.model.Team;

/**
 * Servlet implementation class FrontController
 */
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String target = "index.jsp";
		String uri = request.getRequestURI();
		boolean idempotent = true;
		if (uri != null) {
			FootballLeagueDao leagueDao  = new FootballLeagueDaoJdbcImpl();
			if (uri.endsWith("addGoalForm.action")) {
				try {
					request.setAttribute("teams", leagueDao.getAllTeams());
					request.setAttribute("games", leagueDao.getAllGames());
					target = "goalInfo.jsp";
				} catch (DaoException e) {
					e.printStackTrace();
					request.setAttribute("message", e.getMessage());
				}
			} else if (uri.endsWith("addGoalData.action")) {
				try {
					Goal goal = goalDataFromRequest(request);
					leagueDao.addGoalInfo(goal);
					idempotent = false;
					target = "index.jsp?message=The Goal details has been added successfull";
				} catch (IllegalArgumentException ex) {
					target = "index.jsp?message=" + ex.getMessage();
				} catch (DaoException e) {
					target = "index.jsp?message=" + e.getMessage();
				}
			} else if (uri.endsWith("matchDetails.action")) {
				try {
					request.setAttribute("report", leagueDao.getMatchReport());
					target = "printInfo.jsp";
				} catch (NumberFormatException e) {
					target = "index.jsp?message=" + e.getMessage();
				} catch (DaoException e) {
					target = "index.jsp?message=" + e.getMessage();
				}
			
			}
		}
		if (idempotent) {
			request.getRequestDispatcher(target).forward(request, response);
		} else {
			response.sendRedirect(target);
		}
	}

	private Goal goalDataFromRequest(HttpServletRequest request) {
		Goal goal = new Goal();
			goal.setMatchId(Integer.parseInt(request.getParameter("MATCH_ID")));
			goal.setPlayer(request.getParameter("player"));
			goal.setGoalTime(Integer.parseInt(request.getParameter("GOAL_TIME")));
			Team team = new Team(request.getParameter("SCORING_TEAM"), null, null);
			goal.setScoringTeam(team);
		return goal;
	}


}
