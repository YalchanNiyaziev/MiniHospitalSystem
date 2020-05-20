<%@ page import="controller.model.ListDoctorsModel" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Doctors</title>
    <link rel="stylesheet" type="text/css" href="style/list_doctors.css">
    <link rel="stylesheet" type="text/css" href="style/header.css">
</head>
<body>
<%@include file="static/not_logged.html" %>
<% List<ListDoctorsModel> listDoctors = (List<ListDoctorsModel>) request.getAttribute("doctors");%>
<div id="table-frame">
    <h1 id="table_title">List of doctors</h1>
    <div id="table-div">
        <table>
            <tr>
                <th class="table-cell head">Name</th>
                <th class="table-cell head">Medical ward</th>
                <th class="table-cell head">Speciality</th>
            </tr>
            <%for (ListDoctorsModel doctor : listDoctors) {%>
            <tr>
                <td class="table-cell elem"><a href="show_doctor?id=<%=doctor.getId()%>"><%=doctor.getName()%>
                </a></td>
                <td class="table-cell elem"><%=doctor.getMedicalWard()%>></td>
                <td class="table-cell elem"> <%=doctor.getSpeciality()%></td>
            </tr>
            <%}%>
        </table>
    </div>
</div>
</body>
</html>
