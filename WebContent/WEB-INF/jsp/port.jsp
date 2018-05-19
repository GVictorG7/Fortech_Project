<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${ip}</title>
</head>
<body>
	Porturi inregistrate pentru ${ip}:
	<table>
		<tr>
			<th>ID</th>
			<th>Numar</th>
			<th>Tip</th>
		</tr>
		<c:forEach var="p" items="${ports}">
			<tr>
				<td>${p.getIdPort()}</td>
				<td>${p.getNr()}</td>
				<td>${p.getType()}</td>
			</tr>
		</c:forEach>
	</table>

	<br>
	<br> Inregistrare noi porturi deschise:

	<form:form method="POST" action="/ProjectMVC/addPort">
		<table>
			<tr>
				<td><form:label path="nr">Numar</form:label></td>
				<td><form:input path="nr" /></td>
			</tr>
			<tr>
				<td><form:label path="type">Tip</form:label></td>
				<td><form:input type="password" path="type" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Salvare" /></td>
			</tr>
		</table>
	</form:form>


	<form:form method="GET" action="/ProjectMVC/stations">
		<input type="submit" value="Inapoi" />
	</form:form>

</body>
</html>
