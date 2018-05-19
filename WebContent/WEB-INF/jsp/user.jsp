<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login</title>
</head>
<body>
	<h2>User Login</h2>
	<form:form method="POST" action="/ProjectMVC/login">
		<table>
			<tr>
				<td><form:label path="user">User</form:label></td>
				<td><form:input path="user" /></td>
			</tr>
			<tr>
				<td><form:label path="pass">Pass</form:label></td>
				<td><form:input type="password" path="pass" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
