<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title><tiles:getAsString name="title" /></title>
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet" />
</head>
<body>
    <div class="container">
        <div class="header"><tiles:insertAttribute name="header" /></div>
        <div class="middle">
            <div class="menu"><tiles:insertAttribute name="menu" /></div>
            <div class="body"><tiles:insertAttribute name="body" /></div>
        </div>
        <div class="footer"><tiles:insertAttribute name="footer" /></div>
    </div>
</body>
</html>
