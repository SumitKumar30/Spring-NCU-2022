<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation Page</title>
</head>
<body>
	<h2> Entered Details are as follows: </h2>
	
	<hr>
	
	User Name is: ${user.userName} <br>
	Aaadhar id is: ${user.aadharId } <br>
	State is: ${user.state } <br>
	Gender is: ${user.gender } <br>
	Other verifications: ${list} <br>
	<ul>
	<%-- 	<c:foreach var="temp" items="${user.others}"> 
		<li>${temp} </li>
		</c:foreach> --%>
		
	</ul>
	
 	
	<hr>
</body>
</html>