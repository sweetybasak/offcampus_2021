<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- 5. create jsp file as index and add jstl tag -->
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- 6. Access the model attribute using c:out value=attributeName -->
<c:out value="${heading}"></c:out>
<!-- 7. Configure the view resolver in application.properties -->
<a href="customers">Add Customer</a>
<a href="customers/all">Search Customer</a>
</body>
</html>