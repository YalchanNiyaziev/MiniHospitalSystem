<%@ page import="controller.model.SelectWardHeadModel" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Doctors By Ward</title>
    <link rel="stylesheet" type="text/css" href="style/select_head.css">
    <link rel="stylesheet" type="text/css" href="style/header.css">
</head>
<body>
<%List<SelectWardHeadModel> modelList = (List<SelectWardHeadModel>) request.getAttribute("doctorsByWard");
long currentHead = 0L;%>
<%@include file="static/logged.html"%>
<h1 id="table_title">Doctors By Ward</h1>
<div id="table-frame">

    <div id="table-div">
        <table>
            <tr>
                <th class="table-cell head">№</th>
                <th class="table-cell head">Doctor name</th>
                <th class="table-cell head">Role</th>
                <th class="table-cell head">Specialization</th>
                <th class="table-cell head">EGN</th>
                <th class="table-cell head">&emsp;</th>
            </tr>
    <%for(int i=0;i<modelList.size();i++){%>
            <tr>
                <td class="table-cell elem"><%=i+1%></td>
                <td class="table-cell elem"><%=modelList.get(i).getName()%></td>
                <td class="table-cell elem">
                    <%if(modelList.get(i).isHead()){
                    currentHead = modelList.get(i).getDoctorId();%>
                    Head
                    <%}%>
                </td>
                <td class="table-cell elem"><%=modelList.get(i).getSpecialization()%></td>
                <td class="table-cell elem"><%=modelList.get(i).getEgn()%></td>

                <td class="table-cell elem button-box">
                    <form action="select_head" method="POST" class="button">
                        <input type="submit" value="Select" name="submit">
                        <input type="hidden" value="<%=currentHead%>" name="currentHeadId">
                        <input type="hidden" value="<%=modelList.get(i).getDoctorId()%>" name="newHeadId">
                    </form>
                </td>
            </tr>
        <%}%>

        </table>
    </div>
</div>
</body>
</html>
