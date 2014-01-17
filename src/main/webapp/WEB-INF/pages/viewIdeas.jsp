<%--
  Created by IntelliJ IDEA.
  User: dineshkb
  Date: 1/15/14
  Time: 1:03 PM
  To change this template use File | Settings | File Templates.
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List of Ideas </title>
</head>
<body>
<h1>
    List of Ideas:
</h1>


<form name="pollIdea" method="post" action="/Idea/pollIdea">

    <ul>
        <c:forEach var="idea" items="${ideas}">
            <li>${idea}</li>
        </c:forEach>
    </ul>
    <hr>

    Choose Idea to poll

    <select name="chosenIdea">
        <c:forEach var="idea" items="${ideas}">
            <option value="${idea.id}">${idea}</option>
        </c:forEach>
    </select>

    <br>
    <input type="submit" value="Poll">
</form>
</body>
</html>
