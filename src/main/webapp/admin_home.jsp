<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Home</title>
    <link rel="stylesheet" type="text/css" href="style/admin_home.css">
    <link rel="stylesheet" type="text/css" href="style/header.css">
</head>
<body>
<%@include file="static/admin_header.html"%>
<h1 id="admin-welcome-text">Welcome Admin</h1>

<div id="form-box">
    <form action="register_medical_staff" method="GET">
        <div class="button-frame">
            <div class="buttons">
                <input type="submit" value="Create Medical staff">
            </div>
        </div>
    </form>
    <form action="register_administrative_staff" method="GET">
        <div class="button-frame">
            <div class="buttons">
                <input type="submit" value="Create Administrative staff">
            </div>
        </div>
    </form>
</div>
</body>
</html>
