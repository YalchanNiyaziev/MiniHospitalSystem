<%@ page import="controller.model.ExaminationRequestListModel" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Examination Request</title>
    <link rel="stylesheet" type="text/css" href="style/header.css">
    <link rel="stylesheet" type="text/css" href="style/list_examination_request.css">
</head>
<body>
<%@include file="static/logged.html"%>
<%  List<ExaminationRequestListModel> examReqList =(List<ExaminationRequestListModel>)request.getAttribute("examReqList");%>
<div id="table-frame">
    <h1 id="table_title">List of examination requests</h1>
    <div id="table-div">
        <table>
            <tr>
                <th class="table-cell head">Name</th>
                <th class="table-cell head">Date</th>
                <th class="table-cell head">Status</th>
            </tr>
            <%for (ExaminationRequestListModel examReq : examReqList) {%>
            <tr>
                <td class="table-cell elem"><a href="pending_examination?id=<%=examReq.getId()%>"><%=examReq.getName()%></a></td>
                <td class="table-cell elem"><%=examReq.getDate()%></td>
                <td class="table-cell elem"><%=examReq.getStatus()%></td>
            </tr>
            <%}%>
        </table>
    </div>
</div>

</body>
</html>
