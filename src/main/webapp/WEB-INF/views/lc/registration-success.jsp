<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Success</title>
</head>
<body>
    <h1>You registered successful!</h1>
    <h2>The details you entered are:</h2>
    <p>Name: ${userRegistration.name}</p>
    <p>Username: ${userRegistration.username}</p>
    <p>Country: ${userRegistration.countryName}</p>
    <p>
        Hobbies:
        <ul>
            <c:forEach var="hobby" items="${userRegistration.hobbies}">
                <li>${hobby}</li>
            </c:forEach>
        </ul>
    </p>
    <p>Gender: ${userRegistration.gender}</p>
    <p>Age: ${userRegistration.age}</p>
    <p>Email: ${userRegistration.communicationDTO.email}</p>
    <p>Phone: ${userRegistration.communicationDTO.phoneDTO}</p>
</body>
</html>
