<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation Page</title>
</head>
<body>
	<h1> Hi! ${userName}</h1>
	
	<h2> Entered Details are as follows: </h2>
	
	<hr>
	
	User Name is: ${user.userName} <br><br>
	Registration Code is: ${user.registrationCode} <br><br>
	Aaadhar id is: ${user.aadharId } <br><br>
	Phone No. is: ${user.phoneNo } <br><br>
	State is: ${user.state } <br><br>
	Gender is: ${user.gender } <br><br>
	Other verifications: ${list} <br><br>
	Address is: ${user.address } <br><br>
	<ul>
	<%-- 	<c:foreach var="temp" items="${user.others}"> 
		<li>${temp} </li>
		</c:foreach> --%>
		
	</ul>
	<hr>
	<h2>Send your result to email</h2>
	<form:form action = "sendResult" method="GET" modelAttribute = "user">
		<label>Enter your Email</label>
		<form:input path="userEmail" />
		<input type="submit" value="send">
	</form:form>
	<!-- <a href = "sendResult" >Send result to email</a> -->
</body>
</html>