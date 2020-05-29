<%@ page import="controller.model.ExaminationRequestModel" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pending Examination</title>
    <link rel="stylesheet" type="text/css" href="style/header.css">
    <link rel="stylesheet" type="text/css" href="style/pending_examination.css">
</head>
<body>
<%ExaminationRequestModel examReqModel = (ExaminationRequestModel) request.getAttribute("examReqModel");%>
<%@include file="static/logged.html"%>

<h1 id="title">Pending Examination</h1>
<div id="form-box">

    <div id="inner-box">
        <div class="input-field">
            <label class="label">Name:</label>
            <p class="p" id="name-field"><%=examReqModel.getName()%></p>
        </div>
        <div class="input-field">
            <label class="label">Address:</label>
            <p class="p" id="address-field"><%=examReqModel.getCity()%></p>
        </div>
        <div class="input-field">
            <label class="label">Street:</label>
            <p class="p" id="street-field"><%=examReqModel.getStreet()%> <%=examReqModel.getStreetNum()%></p>
        </div>
        <div class="input-field">
            <label class="label">Date:</label>
            <p class="p" id="date-field"><%=examReqModel.getDate()%> <%=examReqModel.getTime()%></p>
        </div>
        <div class="input-field">
            <label class="label">Phone:</label>
            <p class="p" id="phone-field"><%=examReqModel.getPhone()%></p>
        </div>
        <div class="input-field">
            <label class="label">Email:</label>
            <p class="p" id="email-field"><%=examReqModel.getEmail()%></p>
        </div>
    </div>


        <div id="button-frame">
            <form action="pending_examination" method="POST" class="form">
            <div class="buttons">
                <input type="hidden" name="examReqId" value="<%=examReqModel.getExamReqId()%>">
                <input type="hidden" name="status" value="Approve">
                <input type="submit" value="Approve">
            </div>
    </form>
            <form action="pending_examination" method="POST" class="form">
            <div class="buttons">
                <input type="hidden" name="examReqId" value="<%=examReqModel.getExamReqId()%>">
                <input type="submit" value="Reject" id="reject-button">
                <input type="hidden" name="status" value="Reject">
            </div>
            </form>
        </div>

</div>
</body>
</html>
