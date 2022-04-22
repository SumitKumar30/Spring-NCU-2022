<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Form</title>
</head>
<body>
<div align="center">

		<h2>Student Update Form</h2>
		<br>
		<hr>

		<form:form action="processUpdate" method="post" modelAttribute="student">

			<label for="id">Student ID</label>
			<form:input type="text" path="studentId" readonly="true"/>
			<br>
			<br>

			<label for="name">Student Name</label>
			<form:input type="text" path="studentName" />
			<br>
			<br>

			<label for="address">Student Address</label>
			<br>
			<form:textarea path="studentAddress" rows="5" cols="30" />
			<br>
			<br>

			<input type="submit" value="submit" />

		</form:form>
		<hr>

	</div>
</body>
</html>