<%@ page import="controller.model.MedicalRecordInfoModel" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="style/medical_record_info.css">
    <link rel="stylesheet" type="text/css" href="style/header.css">
</head>
<body>
<%@include file="static/not_logged.html"%>
<%List<MedicalRecordInfoModel> medicalRecords = (List<MedicalRecordInfoModel>) session.getAttribute("patient");
    int i =1;
%>
<div id="table-frame">
    <h1 id="table_title">Medical Records</h1>
    <div id="table-div">
        <table>
            <tr>
                <th class="table-cell head">№</th>
                <th class="table-cell head">Medical Record</th>
                <th class="table-cell head">Type</th>
                <th class="table-cell head">Date</th>
                <th class="table-cell head">Doctor</th>
            </tr>
            <%for(MedicalRecordInfoModel model:medicalRecords){ %>
            <tr>
                <td class="table-cell elem"><%=i++%></td>
                <td class="table-cell elem"><%=model.getMedicalRecordDescription()%></td>
                <td class="table-cell elem"><%=model.getGetMedicalRecordType()%></td>
                <td class="table-cell elem"><%=model.getDate()%></td>
                <td class="table-cell elem"><%=model.getDoctorName()%></td>
            </tr>
            <%}%>
        </table>
    </div>
</div>
</body>
</html>
