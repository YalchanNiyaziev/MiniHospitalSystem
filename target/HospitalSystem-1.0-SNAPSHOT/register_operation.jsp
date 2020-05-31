<%@ page import="controller.model.UserModel" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Operation</title>
    <link rel="stylesheet" type="text/css" href="style/header.css">
    <link rel="stylesheet" type="text/css" href="style/register.css">
</head>
<body>
<%UserModel user = (UserModel) session.getAttribute("user");%>
<%@include file="static/logged.html"%>
<h1 id="title">Register Medical Examination</h1>
<div id="form-box">
    <form action="register_operation" method="POST">
        <div id="inner-box">
            <div class="input-field">
                <label>Name:</label>
                <input type="text" name="name" id="name-field">
            </div>
            <div class="input-field">
                <label>Age:</label>
                <input type="text" name="age" id="age-field">
            </div>
            <div class="input-field">
                <label>EGN:</label>
                <input type="text" name="egn" id="egn-field">
            </div>
            <div class="input-field">
                <label>Address:</label>
                <select name="city" id="address-field">
                    <option value="0" disabled selected>Select a town</option>
                    <option value="Blagoevgrad">Blagoevgrad</option>
                    <option value="Burgas">Burgas</option>
                    <option value="Dobrich">Dobrich</option>
                    <option value="Gabrovo">Gabrovo</option>
                    <option value="Haskovo">Haskovo</option>
                    <option value="Kardzhali">Kardzhali</option>
                    <option value="Kyustendil">Kyustendil</option>
                    <option value="Lovech">Lovech</option>
                    <option value="Montana">Montana</option>
                    <option value="Pazardzhik">Pazardzhik</option>
                    <option value="Pernik">Pernik</option>
                    <option value="Pleven">Pleven</option>
                    <option value="Plovdiv">Plovdiv</option>
                    <option value="Razgrad">Razgrad</option>
                    <option value="Ruse">Ruse</option>
                    <option value="Shumen">Shumen</option>
                    <option value="Silistra">Silistra</option>
                    <option value="Sliven">Sliven</option>
                    <option value="Smolyan">Smolyan</option>
                    <option value="Sofia">Sofia</option>
                    <option value="Stara Zagora">Stara Zagora</option>
                    <option value="Targovishte">Targovishte</option>
                    <option value="Varna">Varna</option>
                    <option value="Veliko Tarnovo">Veliko Tarnovo</option>
                    <option value="Vidin">Vidin</option>
                    <option value="Vratsa">Vratsa</option>
                    <option value="Yambol">Yambol</option>
                </select>
            </div>
            <div class="input-field">
                <label>Street:</label>
                <input type="text" name="street" id="street-field">
            </div>
            <div class="input-field">
                <label>Number:</label>
                <input type="text" name="number" id="street-number-field">
            </div>
            <div class="input-field">
                <label>Date:</label>
                <input type="date" name="date" id="date-field">
            </div>
            <div class="input-field" id="procedure-box">
                <label>Procedure:</label>
                <textarea name="description" id="procedure-description-field"></textarea>
            </div>
            <div class="input-field" id="conclusion-box">
                <label id="mo-label">Conclusion:</label>
                <textarea name="conclusion" id="conclusion-field"></textarea>
            </div>
            <div class="input-field">
                <label>Phone:</label>
                <input type="text" name="phone" id="phone-field">
            </div>

            <input type="hidden" name="doctorId" value="<%=user.getId()%>">

        </div>

        <div id="button-frame">
            <div class="buttons">
                <input type="submit" value="Confirm">
            </div>
            <div class="buttons">
                <button type="button">Cancel</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>
