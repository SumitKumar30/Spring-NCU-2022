<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Input Form</title>
</head>
<body>

	<h2> Aadhar Verification Registration Form </h2>
	
	<hr> <br>
	
	<form:form action="processForm" method="post" modelAttribute="user">
	
	<label for="name">User Name</label>
	<form:input type="text" path="userName" /> <br><br>
	<label for="id">Aadhar ID</label>
	<form:input type="text" path="aadharId" /> <br><br>
	Enter State
	<form:select path="state">
		<%-- <form:option value="Delhi" label="Delhi" />
		<form:option value="UP" label="Uttar Pradesh" />
		<form:option value="HR" label="Haryana" />
		<form:option value="MH" label="Maharashtra" />
		<form:option value="PB" label="Punjab" /> --%>
		
		<form:options items="${user.stateOptions}"/>
		
	</form:select> <br><br><br>
	
	<form:radiobuttons path="gender" items="${user.genderOptions}"/> 
	
	<br><br>
	
	<form:checkboxes path = "others" items="${user.otherOptions}" /> <br> <br>
	
	
	
	<input type="submit" value="submit" />
		
	</form:form>
</body>
</html>