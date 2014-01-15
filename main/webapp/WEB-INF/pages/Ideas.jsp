<%--
  Created by IntelliJ IDEA.
  User: dineshkb
  Date: 1/13/14
  Time: 3:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<h3> welcome, ${user.name} .</h3>
<h4> Post Your Ideas...</h4>

<form id="ideas" method="post" action="/Idea/postIdea">

    <table>

        <tr>
            <td>
                Enter the purpose:
            </td>
            <td>
                <input type="text" name="purpose" id="userName"> </input>
            </td>
        </tr>


        <tr>
            <td>
                Enter your Idea:
            </td>
            <td>
                <input type="text" name="description" id="idea"> </input>
            </td>
        </tr>

        <tr>
            <td>
                <input type="submit" value="Submit">

            </td>

        </tr>
    </table>
    <input type="hidden" name="userName" value=${user.name}>
    <input type="hidden" name="userId" value=${user.id}>
</form>

</body>
</html>
