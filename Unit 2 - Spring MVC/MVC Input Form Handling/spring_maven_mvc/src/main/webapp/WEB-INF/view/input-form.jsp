<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Input Form</title>
</head>
<body>
	<h2> User Input Form </h2>
	<form action="processForm" method="post">
		<label for="userName">Name</label>
		<input type="text" name ="userName" placeholder="enter your name" /> <br> <br>
		<label for="userRoll">Roll No.</label>
		<input type="text" name ="userRoll" placeholder="enter your roll no." /> <br><br>
		<label for="userPass">Password</label>
		<input type="password" name="userPass" placeholder="enter password" /> <br><br><br>
		<input type="submit" /> 
	</form>
</body>
</html>