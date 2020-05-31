<%@ page import="controller.model.SelectTeamModel" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Select Team</title>
    <link rel="stylesheet" type="text/css" href="style/select_team.css">
    <link rel="stylesheet" type="text/css" href="style/header.css">
</head>
<body>
<%List<SelectTeamModel> modelList = (List<SelectTeamModel>) request.getAttribute("modelList");%>
<%@include file="static/logged.html"%>
<h1 id="table_title">Select operation team</h1>
<div id="table-frame">
    <form action="select_team" method="POST">
        <div id="table-div" >
            <table>
                <tr>
                    <th class="table-cell head">&emsp;</th>
                    <th class="table-cell head">Medical staff name</th>
                    <th class="table-cell head">Specialization</th>
                    <th class="table-cell head">EGN</th>
                </tr>
        <%for(SelectTeamModel model : modelList){%>
                <tr>
                    <td class="table-cell elem">
                        <input type="checkbox" name="staffId" value="<%=model.getMedicalStaffId()%>">
                    </td>
                    <td class="table-cell elem"><%=model.getName()%></td>
                    <td class="table-cell elem"><%=model.getSpecialization()%></td>
                    <td class="table-cell elem"><%=model.getEgn()%></td>
                </tr>
            <%}%>
            </table>
        </div>
        <div class="button-box">
            <input type="submit" value="Confirm" >
        </div>
    </form>
</div>
</body>
</html>
