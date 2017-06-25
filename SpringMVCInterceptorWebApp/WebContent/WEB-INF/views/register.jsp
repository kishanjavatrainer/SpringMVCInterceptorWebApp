<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form:errors path="student.*"></form:errors>
	<form:form action="/SpringMVCInterceptorWebApp/registerSuccess"
		method="post" commandName="student">
		<h2 align="center">Student Registration form</h2>
		<table align="center">
			<tr>
				<td>Enter your Name:</td>
				<td><form:input path="studentName" /></td>
			</tr>

			<tr>
				<td>Gender:</td>
				<td><form:radiobuttons path="gender" items="${genderList}" /></td>
			</tr>

			<tr>
				<td>Select Technologies:</td>
				<td><form:select path="technologies">
						<form:options items="${technologyList}" />
					</form:select></td>

			</tr>

			<tr>
				<td>Select city:</td>
				<td><form:select path="city">
						<form:options items="${citisList}" />
					</form:select></td>
			</tr>

			<tr>
				<td>Enter Phone number:</td>
				<td><form:input path="phone" /></td>
			</tr>

			<tr>
				<td>Date Of Joining:</td>
				<td><form:input path="doj" />(yyyy-MM-dd)</td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>

	</form:form>
</body>
</html>