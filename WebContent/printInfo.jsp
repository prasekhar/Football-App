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
	<h2>Summary of Matches</h2>
	<table border="1">
		<tr>
			<th>Match Date</th>
			<th>Stadium</th>
			<th>First Team</th>
			<th>Score</th>
			<th>Second Team</th>
			<th>Score</th>
		</tr>
		
		<c:forEach items="${report}" var="match">
			<tr>
				<td> ${match.matchDate} </td>
				<td> ${match.stadium} </td>
				<td> ${match.firstTeam} </td>
				<td> ${match.firstTeamScore} </td>
				<td> ${match.secondTeam} </td>
				<td> ${match.secondTeamScore} </td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>