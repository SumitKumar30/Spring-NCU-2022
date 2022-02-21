<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Input Form</title>
</head>
<body>
	<form action="processForm" method="GET">
		<input type="text" name="studentName" placeholder="Enter your name" />
		<input type="password" name = "studentPass" placeholder="Enter your password" />
		<input type="submit" />
	</form>
</body>
</html>