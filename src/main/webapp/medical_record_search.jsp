<%@ page contentType="text/html;charset=UTF-8" language="java" %><!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Search medical records</title>
    <link rel="stylesheet" type="text/css" href="style/search_medical_records.css">
    <link rel="stylesheet" type="text/css" href="style/header.css">
</head>
<body>
<%@include file="static/not_logged.html"%>
<h1 id="egn-text">Write Unique Person Identifier-EGN</h1>
<div id="form-box">
    <form>
        <div class="input-field">
            <input type="text" name="egn" placeholder="EGN">
        </div>
        <div id="button-frame">
            <div class="buttons">
                <input type="submit" value="OK">
            </div>
            <div class="buttons">
                <button type="button" value="CANCEL">CANCEL</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>