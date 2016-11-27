<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bug Tracker</title>
</head>
<body>
	<h1>Football League</h1>
	<div id="errorDiv" class="errorClazz">${param.errorMessage}${errorMessage}</div>
	<div id="message" class="messageClazz">${param.message} ${message}</div>
	<a href="addGoalForm.action">Add Goal information</a> <br />
	<a href="matchDetails.action">Display Match details</a> <br />
</body>
</html>