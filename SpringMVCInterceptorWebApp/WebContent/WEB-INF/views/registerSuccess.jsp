<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<a href="/SpringMVCInterceptorWebApp/">Back</a>
	<h3 align="center">You have registered with following Info::::</h3>

	<table align="center">
		<tr>
			<td>Student Name:</td>
			<td>${student.studentName}</td>
		</tr>

		<tr>
			<td>Student Gender</td>
			<td>${student.gender}</td>
		</tr>

		<tr>
			<td>Selected Technologies:</td>
			<td>${student.technologies}</td>
		</tr>

		<tr>
			<td>City</td>
			<td>${student.city}</td>
		</tr>
		
		<tr>
			<td>Phone</td>
			<td>${student.phone}</td>
		</tr>
		<tr>
			<td>Date Of Joining</td>
			<td>${student.doj}</td>
		</tr>
		
	</table>
</body>
</html>