<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Manager Home</title>
    <link rel="stylesheet" type="text/css" href="style/manager_home.css">
    <link rel="stylesheet" type="text/css" href="style/header.css">
</head>
<body>
<%@include file="static/logged.html"%>
<h1 id="manager-welcome-text">Welcome Manager</h1>
<div id="form-box">
    <form action="select_med_ward" method="GET">
        <div id="button-frame">
            <div class="buttons">
                <input type="submit" value="Select Medical Ward Head">
            </div>
        </div>
    </form>
</div>

</body>
</html>
