<%--
  Created by IntelliJ IDEA.
  User: A
  Date: 22.5.2020 г.
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Staff</title>
    <link rel="stylesheet" type="text/css" href="style/header.css">
    <link rel="stylesheet" type="text/css" href="style/register.css">
</head>
<body>
<%@include file="static/logged.html"%>
<h1 id="title">Register Medical Staff</h1>
<div id="form-box">
    <form action="register_staff" method="POST">
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
                <label>Ward:</label>
                <select name="ward" id="ward-field">
                    <option value="0" disabled selected>Select a medical ward</option>
                    <option value="Ortopedy">Ortopedy</option>
                    <option value="Inner disease">Inner disease</option>
                    <option value="Cardiology">Cardiology</option>
                    <option value="Nevrology">Nevrology</option>
                </select>
            </div>
            <div class="input-field">
                <label id="spec-label">Spec:</label>
                <select name="speciality" id="speciality-field">
                    <option value="0" disabled selected>Select a speciality</option>
                    <option value="Orto Knee">Orto Knee</option>
                    <option value="Child Inner disease">Child Inner disease</option>
                    <option value="Super Cardiology">SUper Cardiology</option>
                    <option value="Child Nevrology">Child Nevrology</option>
                </select>
            </div>
            <div class="input-field">
                <label id="role-label">Role:</label>
                <select name="role" id="role-field">
                    <option value="0" disabled selected>Select a role</option>
                    <option value="Doctor">Doctor</option>
                    <option value="Nurse">Nurse</option>
                    <option value="Midwife">Midwife</option>
                    <option value="Child Anestialogyst">Anestialogyst</option>
                </select>
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
                <label>Email:</label>
                <input type="email" name="email" id="email-field">
            </div>
            <div class="input-field">
                <label>Password:</label>
                <input type="password" name="password" id="password-field">
            </div>
            <div class="input-field">
                <p id="conf-pass-label">Confirm Password:</p>
                <input type="password" name="confirmPassword" id="conf-password-field">
            </div>
            <div class="input-field">
                <label>Phone:</label>
                <input type="text" name="phone" id="phone-field">
            </div>


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
