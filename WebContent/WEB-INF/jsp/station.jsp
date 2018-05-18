<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>lista statiilor</title>
</head>
<body>
	<h1>Welcome ${user}!</h1>
	<h2>ce probleme ai mai gasit?</h2>

	Inregistreaza o noua statie descoperita
	<form:form method="GET" action="/ProjectMVC/addStation">
		<table>
			<tr>
				<td><form:label path="ip">IP</form:label></td>
				<td><form:input path="ip" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
	<br>
	<br> lista statiilor:
	<br>
	<form:form method="GET" action="/ProjectMVC/stations">
		<input type="submit" value="Afiseaza statiile" />
	</form:form>
	<table>
		<tr>
			<th>ID</th>
			<th>IP</th>
			<th>Numar Porturi</th>
		</tr>
		<c:forEach var="st" items="${stations}">
			<tr>
				<td>${st.getIdStation()}</td>
				<td>${st.getIp()}</td>
				<td>${st.getPorts().size()}</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br> Detalii statie:
	<form:form method="GET" action="/ProjectMVC/detalii">
		<form:label path="idStation">ID</form:label>
		<form:input path="idStation" />

		<input type="submit" value="Detalii" />
	</form:form>
	
	

	<form:form method="POST" action="/ProjectMVC/logout">
		<input type="submit" value="Logout">
	</form:form>

</body>
</html>