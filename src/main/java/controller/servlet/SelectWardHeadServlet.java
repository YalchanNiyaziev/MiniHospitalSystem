package controller.servlet;

import controller.model.SelectWardHeadModel;
import service.SelectWardHeadService;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/select_head")
public class SelectWardHeadServlet extends HttpServlet {

    @Inject
    private SelectWardHeadService selectWardHeadService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int wardNum = Integer.parseInt(req.getParameter("ward"));
        List<SelectWardHeadModel> wardDoctorList = selectWardHeadService.getAllDoctorsByWard(wardNum);
        req.setAttribute("doctorsByWard", wardDoctorList);
        RequestDispatcher rd = req.getRequestDispatcher("select_ward_head.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long newHeadId = Long.parseLong(req.getParameter("newHeadId"));
        long currentHeadId = Long.parseLong(req.getParameter("currentHeadId"));
        selectWardHeadService.selectHead(newHeadId,currentHeadId);
        resp.sendRedirect("manager_home");

    }
}
