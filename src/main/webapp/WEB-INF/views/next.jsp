<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${contextPath.request.contextPath}/spring-core" />
<!DOCTYPE html>
<html>
<head>
    <title>Next</title>
</head>
<body>
    <h1>User fetching from request: ${requestScope.password}</h1>
    <h1>User fetching from session: ${sessionScope.password}</h1>
</body>
</html>