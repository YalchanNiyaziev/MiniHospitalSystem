<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="style/success.css">
    <link rel="stylesheet" type="text/css" href="style/header.css">
</head>
<body>
<%@include file="static/not_logged.html"%>
<div id="form-box">
    <p id="text">Success</p>
    <div>
        <form action="/" method="GET" id="button">
            <input type="submit" value="Back to home page" name="submit">
        </form>
    </div>
</div>
</body>
</html>
