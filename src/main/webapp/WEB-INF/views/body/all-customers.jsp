<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<html>
<head>
    <title>All Customers</title>
    <link rel="shortcut icon" href="">
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>
    <h1>All Customers</h1>
    <div>
        <a href="${contextPath}/create-customer-form">Create Customer</a>
    </div>
    <br />
    <br />
    <table class="all-customers">
        <tr>
            <th>Customer ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Birthdate</th>
            <th>Phone</th>
            <th>Address</th>
            <th>City</th>
            <th>State</th>
            <th>Points</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="customer" items="${customers}">
            <tr>
                <td>${customer.customerId}</td>
                <td>${customer.firstName}</td>
                <td>${customer.lastName}</td>
                <td>${customer.birthDate}</td>
                <td>${customer.phone}</td>
                <td>${customer.address}</td>
                <td>${customer.city}</td>
                <td>${customer.state}</td>
                <td>${customer.points}</td>
                <td><a href="${contextPath}/update-customer-form/${customer.customerId}">Update</a> | <a href="${contextPath}/delete-customer-confirm/${customer.customerId}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
