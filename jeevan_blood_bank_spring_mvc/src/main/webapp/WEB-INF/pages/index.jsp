<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>
	<h1><c:out value="${title}"></c:out></h1>
	<ul>
		<li><a href="donors">Add Blood Donor</a></li>
	</ul>
</body>
</html>