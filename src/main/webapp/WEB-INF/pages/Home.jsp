<html>
<body>

<head>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/Extras/jquery.js"></script>
</head>
<h1>${message}</h1>



<form id="home" method="post">

    <a href="/Home/login" >Log in to poll</a>
    <br>
    Name: <input type="text" id="name">
    Suggestion: <input type="value" id="suggestion">
    <input type="submit" value="login.." onclick="return ajaxFunction();">
    <input type="text" id="resultText">
    <div id="result"> </div>
</form>

</body>
</html>