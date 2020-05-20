<%@ page import="controller.model.ShowDoctorModel" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Doctor</title>
    <link rel="stylesheet" type="text/css" href="style/doctor_page.css">
    <link rel="stylesheet" type="text/css" href="style/header.css">
</head>
<body>
<%@include file="static/not_logged.html"%>
<%ShowDoctorModel doctorModel = (ShowDoctorModel) request.getAttribute("selected_doctor");%>
<div id="form-box">
    <p class="doctor-attribute"><div class="attribute-name">Name:</div> <div class="attribute-value" id="name"><%=doctorModel.getName()%></div></p>
    <p class="doctor-attribute"><div class="attribute-name">Medical Ward:</div><div class="attribute-value" id="ward"><%=doctorModel.getMedicalWard()%></div></p>
    <p class="doctor-attribute"><div class="attribute-name">Speciality:</div> <div class="attribute-value" id="speciality"><%=doctorModel.getSpeciality()%></div></p>
    <p class="doctor-attribute"><div class="attribute-name">Age:</div> <div class="attribute-value" id="age"><%=doctorModel.getAge()%></div></p>
    <p class="doctor-attribute"><div class="attribute-name">About:</div><div class="attribute-value"  id="about"><%=doctorModel.getDescription()%></div></p>

    <div id="buttons">
        <div id="button1">
            <form action="examination_request" method="GET">
                <input type="hidden" name="id" value=<%=doctorModel.getId()%>>
                <input type="submit" name="submit" value="Make Examination Request">
            </form>
        </div>
        <div id="button2">
            <form action="list_doctors" method="GET">
                <input type="submit" name="cancel" value="Cancel">
            </form>
        </div>
    </div>
</div>
</body>
</html>
