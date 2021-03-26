<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<html>
<head>
    <title>Create Customer</title>
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet" />
</head>
<body>
    <h1>Create New Customer</h1>
    <div>
        <a href="${contextPath}/get-customers">Show Customers</a>
    </div>
    <br />
    <br />
    <form:form action="${contextPath}/create-customer" modelAttribute="customer">
        <table>
            <tr>
                <td>First Name<span class="error">*</span>: </td>
                <td><form:input path="firstName" /></td>
                <td><form:errors path="firstName" cssClass="error" /></td>
            </tr>
            <tr>
                <td>Last Name: </td>
                <td><form:input path="lastName" /></td>
            </tr>
            <tr>
                <td>Birthdate: </td>
                <td><form:input type="date" path="birthDate" /></td>
            </tr>
            <tr>
                <td>Phone<span class="error">*</span>: </td>
                <td><form:input path="phone" /></td>
                <td><form:errors path="phone" cssClass="error" /></td>
            </tr>
            <tr>
                <td>Address<span class="error">*</span>: </td>
                <td><form:input path="address" /></td>
                <td><form:errors path="address" cssClass="error" /></td>
            </tr>
            <tr>
                <td>City<span class="error">*</span>: </td>
                <td><form:input path="city" /></td>
                <td><form:errors path="city" cssClass="error" /></td>
            </tr>
            <tr>
                <td>State: </td>
                <td><form:input path="state" /></td>
            </tr>
            <tr>
                <td>Points: </td>
                <td><form:input type="number" path="points" /></td>
            </tr>
            <tr class="buttons">
                <td></td>
                <td><input type="submit" value="Create" /></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
