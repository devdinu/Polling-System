<%--
  Created by IntelliJ IDEA.
  User: dineshkb
  Date: 1/10/14
  Time: 2:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<script language="javascript" type="text/javascript">

    function showNameControl() {
        document.getElementById('NameControl').style.visibility = 'visible'
        document.getElementById('IdControl').style.visibility = 'hidden'
    }
    function showIdControl() {
    }
    document.getElementById('IdControl').style.visibility = 'visible'
    document.getElementById('NameControl').style.visibility = 'hidden'

</script>


<head>
    <title> Polling System</title>
</head>

<style>

    body{
       font-size: medium;
        font-family: Serif;
    }
    h1 {
        background: border-box;
        background-color: skyblue;
        color: azure;
        align-content: center;
        align-self: center;
    }

    button {
        color: skyblue;
    }

    h3 {
        color: brown;
    }


</style>

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
                <button id="submit" value="go." autofocus="true">
                    Go...
                </button>
            </td>
        </tr>


    </table>


</form>

</body>
</html>
