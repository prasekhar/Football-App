<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Football League</title>
</head>
<body>
<h2>Goal Scored details</h2>
	<div id="messageDiv" style="color: red, font-size: 12px'">
		${requestScope.message} ${param.message}</div>
	
	<form method="post" action="addGoalData.action">
		<table>
			<tr>
				<td>Match</td>
				<td>
					<select name="MATCH_ID">
					<option value="-1"> --SELECT-- </option>
						<c:forEach var="match" items="${games}">
							<option value="${match.gameId}"> ${match.matchDate} - [ ${match.stadium} ]</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>Scoring Team</td>
				<td>
					<select name="SCORING_TEAM">
					<option value="-1"> --SELECT-- </option>
						<c:forEach var="team" items="${teams}">
							<option value="${team.teamId}"> ${team.teamId} - ${team.teamName}</option>
						</c:forEach>
					</select>
				
				</td>
			</tr>
			<tr>
				<td>Player</td>
				<td><input type="text" name="player" /></td>
			</tr>
			<tr>
				<td>Goal Time</td>
				<td><input type="text" name="GOAL_TIME" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add Goal details" /></td>
				<td><input type="button" value="Cancel" onclick="window.location.href='index.jsp'"/></td>
			</tr>
		</table>
	</form>
</body>
</html>