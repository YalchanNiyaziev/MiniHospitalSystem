<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Medical Staff</title>
    <link rel="stylesheet" type="text/css" href="style/header.css">
    <link rel="stylesheet" type="text/css" href="style/register.css">
</head>
<body>
<%if (session.getAttribute("admin") == null) {%>
<%@include file="static/logged.html" %>
<%
} else {%>
<%@include file="static/admin_header.html" %>
<%}%>
<h1 id="title">Register Medical Staff</h1>
<div id="form-box">
    <form action="register_medical_staff" method="POST">
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
                <label>Ward:</label>
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
            <div class="input-field">
                <label id="spec-label">Spec:</label>
                <select name="specialization" id="speciality-field">
                    <option value="0">Anesthesiology and intensive care</option>
                    <option value="1">Cardiology</option>
                    <option value="2">Cardiac surgery</option>
                    <option value="3">Clinical allergology</option>
                    <option value="4">Clinical hematology</option>
                    <option value="5">Clinical immunology</option>
                    <option value="6">Clinical microbiology</option>
                    <option value="7">Clinical virology</option>
                    <option value="8">Ear Nose Throat diseases</option>
                    <option value="9">Endocrinology and metabolic diseases</option>
                    <option value="10">Emergency medicine</option>
                    <option value="11">Gastroenterology</option>
                    <option value="12">General medicine</option>
                    <option value="13">General and clinical pathology</option>
                    <option value="14">Infectious diseases</option>
                    <option value="15">Nephrology</option>
                    <option value="16">Neurosurgery</option>
                    <option value="17">Obstetrics and gynecology</option>
                    <option value="18">Oral pathology</option>
                    <option value="19">Orthodontics</option>
                    <option value="20">Orthopedics and traumatology</option>
                    <option value="21">Pediatric surgery</option>
                    <option value="22">Periodontology</option>
                    <option value="23">Physical and rehabilitation medicine</option>
                    <option value="24">Pneumology and phthisiology</option>
                    <option value="25">Rheumatology</option>
                    <option value="26">Psychiatry</option>
                    <option value="27">Surgery</option>
                    <option value="28">Virology</option>
                    <option value="29">Urology</option>

                </select>
            </div>
            <div class="input-field">
                <label id="role-label">Role:</label>
                <select name="role" id="role-field">
                    <option value="Doctor">Doctor</option>
                    <option value="0">Nurse</option>
                    <option value="1">Midwife</option>
                    <option value="2">Physician</option>
                    <option value="3">Anesthetist</option>
                    <option value="4">Paramedic</option>
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
                <label>Number:</label>
                <input type="text" name="number" id="street-number-field">
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
