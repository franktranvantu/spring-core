<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>
    <form:form action="process-registration" method="post" modelAttribute="userRegistration">
        <div style="text-align: center">
            <h1>Please register here</h1>
            <p>
                <label for="name">Name:</label>
                <form:input path="name" id="name" />
            </p>
            <p>
                <label for="username">Username:</label>
                <form:input path="username" id="username" />
            </p>
            <p>
                <label for="password">Password:</label>
                <form:input path="password" id="password" />
            </p>
            <p>
                <label for="countryName">Country:</label>
                <form:select path="countryName" id="countryName">
                    <form:option value="vi" label="Vietnam"/>
                    <form:option value="us" label="United State"/>
                    <form:option value="uk" label="England"/>
                </form:select>
            </p>
            <p>
                <label>Hobbies:</label>
                <form:checkbox path="hobbies" value="code" label="Code"/>
                <form:checkbox path="hobbies" value="game" label="Game"/>
                <form:checkbox path="hobbies" value="sport" label="Sport"/>
            </p>
            <p>
                <label>Gender:</label>
                <label for="male">Male:</label><form:radiobutton path="gender" id="male" value="male"/>
                <label for="female">FeMale:</label><form:radiobutton path="gender" id="female" value="female"/>
            </p>
            <button type="submit">Register</button>
        </div>
    </form:form>
</body>
</html>
