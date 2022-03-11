<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Process Form</title>
</head>
<body>
	<h2>Entered details are</h2>
	<br>
	<hr>
	<br>
	student name: ${param.username} <br> 
	student password: ${param.password} <br>
	gender: ${gender} <br>
	student age: ${param.age } <br>
	languages known: ${languages} <br>
	instructions: ${param.instruction }
	<br>
</body>
</html>