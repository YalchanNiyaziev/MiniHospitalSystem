<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="style/login.css">
    <link rel="stylesheet" type="text/css" href="style/header.css">
</head>
<body>
<%@include file="static/not_logged.html"%>
<div id="form-box">
    <form>
        <div class="input-field">
            <label>Username: </label>
            <input type="text" name="username" placeholder="Username">

        </div>
        <div class="input-field">
            <label>
                Password:  </label>
            <input type="password" name="password" placeholder="Password">

        </div>
        <div class="buttons">
            <input type="submit" name="submit" value="Login">
        </div>
    </form>
</div>
</body>
</html>