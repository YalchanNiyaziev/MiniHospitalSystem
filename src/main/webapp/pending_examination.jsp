<%--
  Created by IntelliJ IDEA.
  User: A
  Date: 22.5.2020 г.
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pending Examination</title>
    <link rel="stylesheet" type="text/css" href="style/header.css">
    <link rel="stylesheet" type="text/css" href="style/pending_examination.css">
</head>
<body>

<%@include file="static/logged.html"%>

<h1 id="title">Pending Examination</h1>
<div id="form-box">

    <div id="inner-box">
        <div class="input-field">
            <label class="label">Name:</label>
            <p class="p" id="name-field">Ivan Peshev Milushec</p>
        </div>
        <div class="input-field">
            <label class="label">Address:</label>
            <p class="p" id="address-field">Varna</p>
        </div>
        <div class="input-field">
            <label class="label">Street:</label>
            <p class="p" id="street-field">Shipka 11</p>
        </div>
        <div class="input-field">
            <label class="label">Date:</label>
            <p class="p" id="date-field">05.07.2020</p>
        </div>
        <div class="input-field">
            <label class="label">Phone:</label>
            <p class="p" id="phone-field">026352653.5165</p>
        </div>
        <div class="input-field">
            <label class="label">Email:</label>
            <p class="p" id="email-field">Some Emao; kjnjsd</p>
        </div>
        <input type="hidden" name="doctor_id" value="99999">
    </div>

    <form>
        <div id="button-frame">
            <div class="buttons">
                <input type="submit" value="Approve">
            </div>
            <div class="buttons">
                <button type="button">Reject</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>
