<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${contextPath.request.contextPath}/spring-core" />
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Session Attributes</title>
    <style type="text/css">
        table {
            width: 50%;
            border-collapse: collapse;
            border-spacing: 0px;
        }
        table td {
            border: 1px solid #565454;
            padding: 20px;
        }
    </style>
</head>
<body>
    <h1>Hello ${username}</h1>
    <h1>Your password ${password}</h1>

    <h2>Users List</h2>
    <table>
        <tr>
            <td><strong>Name</strong></td>
            <td><strong>Email</strong></td>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.name}</td>
                <td>${user.email}</td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="${contextPath}/${next}">Next / ${next}</a>
</body>
</html>