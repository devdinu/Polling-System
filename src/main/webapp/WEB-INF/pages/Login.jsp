<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dineshkb
  Date: 1/10/14
  Time: 2:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>


<head>
    <title> Polling System</title>
    <link href="${pageContext.request.contextPath}/Extras/style.css" rel="stylesheet">
    <script language="JavaScript" src="${pageContext.request.contextPath}/Extras/scripts.js"></script>
</head>


<body>
<h1>${message}</h1>
<hr>

<h3>
    Welcome to polling. Give your ideas or poll for ideas
</h3>


<form name="Welcome" id="welcome" method="post" action="/Home/login">
    <table>


        <tr>
            <td>log with</td>
            <td><input type="radio" value="userId" name="credential" onclick="showIdControl()"> User Id</td>
            <td><input type="radio" value="userName" name="credential" onclick="showNameControl()"> User Name</td>
        </tr>

        <hr>
        <tr id="NameControl">
            <td>
                Enter your Name:
            </td>
            <td>
                <input type="text" name="name" id="userName"> </input>
            </td>
        </tr>
        <tr id="IdControl">
            <td>Id:</td>
            <td>
                <input type="text" name="id" id="userId"> </input>
            </td>
        </tr>
        <tr>
            <td>Password:</td>
            <td>
                <input type="PASSWORD" name="password" id="userPwd"> </input>
            </td>
        </tr>

        <tr align="justify">
            <td><input type="radio" value="sign_in" name="userStatus"> Sign in</td>
            <td><input type="radio" value="sing_up" name="userStatus"> Sign up</td>
        </tr>

        <tr align="justify">
            <td>
                <input type="radio" name="pollType" value="post"> Poll Ideas
            </td>
            <td>
                <input type="radio" name="pollType" value="poll"> Post Ideas
            </td>

        </tr>
        <tr align="center">
            <td>
                <br>
                <button id="submit" value="go." autofocus="true" onclick="checkControls()">
                    Go...
                </button>
            </td>
        </tr>


    </table>


</form>

</body>
</html>
