<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
</head>
<body>
	<h1 align="center">Student Dashboard</h1>
	<i>Students data coming soon...</i>
	<br>
	<div align="center">
	<%-- ${students} --%>
	<table border=1>
		<thead>
			<tr>
				<td>Student Id</td>
				<td>Student Name</td>
				<td>Student Address</td>
				<td>Operation</td>
			</tr>
		</thead>

		
		<c:forEach var="student" items="${students}">
			<%-- ${student} <br> --%>
			<tr>
				<td>${student.studentId }</td>
				<td>${student.studentName }</td>
				<td>${student.studentAddress }</td>
				<td>coming soon..</td>
			</tr>
		</c:forEach>

	</table>
	</div>
</body>
</html>