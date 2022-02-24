<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Process Form</title>
</head>
<body>
	<h2>Data Received</h2>
	<br> <br>
	<hr>
	<br>
	<h3> Student Name: ${param.userName} </h3>
	<h3> Student Roll: ${param.userRoll} </h3>
	<h3> Student Pass: ${param.userPass} </h3>
	<h4> Manipulated Data: ${manipulatedName} </h4> <br> 
	<hr>
	
</body>
</html>