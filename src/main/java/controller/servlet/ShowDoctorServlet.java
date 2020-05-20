package controller.servlet;

import service.ShowDoctorService;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/show_doctor")
public class ShowDoctorServlet extends HttpServlet {

    @Inject
    private ShowDoctorService showDoctorService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        RequestDispatcher rd = req.getRequestDispatcher("doctor_page.jsp");
        req.setAttribute("selected_doctor", showDoctorService.getDoctorBYId(id));
        rd.forward(req, resp);

    }
}
