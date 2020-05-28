<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Doctor Home</title>
    <link rel="stylesheet" type="text/css" href="style/header.css">
    <link rel="stylesheet" type="text/css" href="style/doctor_home.css">

</head>
<body>
<%@include file="static/logged.html"%>
<div id="frame-box">
    <div id="header-frame">

        <div id="welcome-message-frame">
            <h1 id="welcome-message">Welcome doctor stamov</h1>
        </div>
    </div>
    <div id="body-frame">
        <div id="button-box">
            <div class="button">
                <form action="list_examination_request" method="GET">
                    <input type="hidden" name="id" value="9999999">
                    <input type="submit" value="examination notifications" name="submit">
                </form>
            </div>
            <div class="button">
                <form action="register_examination" method="GET">
                    <input type="submit" value="register examination" name="submit">
                </form>
            </div>
            <div class="button">
                <form>
                    <input type="submit" value="register operation" name="submit">
                </form>
            </div>
            <div class="button">
                <form action="register_medical_staff" method="GET">
                    <input type="submit" value="register staff" name="submit">
                </form>
            </div>
            <div class="button">
                <form>
                    <input type="submit" value="Date operation" name="submit">
                </form>
            </div>
        </div>
        <div id="schedule-box">
            <h1>Schedule</h1>
            <div id="schedule">
                <div id="month-year">
                    <h2 id="month-name">Month</h2>
                    <h2 id="year-name">2020</h2>
                </div>

                <table id="table">

                    <tbody>
                    <tr>
                        <th class="row-num">&emsp;</th>
                        <th class="hours">08:00-09:00</th>
                        <th class="hours">09:00-10:00</th>
                        <th class="hours">10:00-11:00</th>
                        <th class="hours">11:00-12:00</th>
                        <th class="hours">12:00-13:00</th>
                        <th class="hours">13:00-14:00</th>
                        <th class="hours">14:00-15:00</th>
                        <th class="hours">15:00-16:00</th>
                        <th class="hours">16:00-17:00</th>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">1</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">2</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">3</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">4</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">5</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">6</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">7</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">8</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">9</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">10</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">12</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">14</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">15</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">16</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">17</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">18</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">19</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">20</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">21</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">22</td>
                        <td class="task">Examination</td>
                        <td class="task">Examination</td>
                        <td class="task">Examination</td>
                        <td class="task">Examination</td>
                        <td class="task">Examination</td>
                        <td class="task">Examination</td>
                        <td class="task">Examination</td>
                        <td class="task">Examination</td>
                        <td class="task">Examination</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">23</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">24</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">25</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">26</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">27</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">28</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">29</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>  <tr class="month-day">
                        <td class="row-num">30</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>
                    <tr class="month-day">
                        <td class="row-num">31</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Examination</td>
                        <td class="task">Opeartion</td>
                        <td class="task">Examination</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                        <td class="task">Operation</td>
                    </tr>


                    </tbody>

                </table>

            </div>
        </div>
    </div>
</div>
</body>
</html>
