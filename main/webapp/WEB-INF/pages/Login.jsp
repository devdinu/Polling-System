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
    <title></title>
</head>
<body>
<head1>${message}</head1>

<br>
<hr>
<%
    out.println("Welcome to polling. Give your ideas or poll for ideas");
%>

<br>

<form name="Welcome" id="welcome" method="post" action="/Home/login">
    <table>
        <tr>
            <td>
                Enter your Name:
            </td>
            <td>
                <input type="text" name="name" id="userName"> </input>
            </td>
        </tr>
        <tr>
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

        <tr>
            <td>
                <button id="submit" value="go." autofocus="true">
                    Go...
                </button>
            </td>
        </tr>
    </table>

</form>

</body>
</html>
