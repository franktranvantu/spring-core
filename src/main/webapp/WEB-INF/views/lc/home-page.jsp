<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Love Calculator</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
    <form:form action="process-homepage" modelAttribute="userInfo" method="get">
        <div style="text-align: center">
            <h1>Love Calculator</h1>
            <p>
                <label for="name">Your name:</label>
                <form:input path="name" id="name" />
                <br>
                <form:errors path="name" cssClass="error" />
            </p>
            <p>
                <label for="crushName">Crush name:</label>
                <form:input path="crushName" id="crushName" />
            </p>
            <button type="submit">Calculate</button>
        </div>
    </form:form>
    <script>
        function validate() {
          const name = document.querySelector('#name').value;
          if (name.trim().length < 3) {
            alert('Name must be at least 3 characters!');
            return false;
          }
          return true;
        }
    </script>
</body>
</html>
