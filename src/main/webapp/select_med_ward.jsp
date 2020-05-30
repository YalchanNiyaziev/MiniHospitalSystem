<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Select Head Medical Ward</title>
    <link rel="stylesheet" type="text/css" href="style/register.css">
    <link rel="stylesheet" type="text/css" href="style/header.css">
</head>
<body>
<%@include file="static/logged.html"%>
<h1 id="title">Select Medical Ward Head</h1>
<div id="form-box">
    <form action="select_head" method="GET">
        <div id="inner-box">
            <div class="input-field">
                <label>Medical Ward:</label>
                <select name="ward" id="ward-field">
                    <option value="0">Allergology</option>
                    <option value="1">Anesthesiology and resuscitation</option>
                    <option value="2">Bacteriology and microbiology</option>
                    <option value="3">Internal diseases</option>
                    <option value="4">Cardiology</option>
                    <option value="5">Dental medicine</option>
                    <option value="6">Department of pediatrics</option>
                    <option value="7">Dermatology</option>
                    <option value="8">Ear Nose Throat</option>
                    <option value="9">Endocrinology</option>
                    <option value="10">Gastroenterology</option>
                    <option value="11">General surgery</option>
                    <option value="12">Gynecology</option>
                    <option value="13">Hematology</option>
                    <option value="14">Infectious diseases and clinical microbiology</option>
                    <option value="15">Neurology</option>
                    <option value="16">Neurosurgery</option>
                    <option value="17">Ophthalmology</option>
                    <option value="18">Orthopedy</option>
                    <option value="19">Physiotherapy and rehabilitation</option>
                    <option value="20">Psychiatry</option>
                    <option value="21">Psychology</option>
                    <option value="22">Urology</option>

                </select>
            </div>
        </div>
        <div id="button-frame">
            <div class="buttons">
                <input type="submit" value="Confirm">
            </div>
        </div>
    </form>
</div>
</body>
</html>
