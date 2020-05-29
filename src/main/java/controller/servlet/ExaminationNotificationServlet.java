package controller.servlet;

import controller.model.ExaminationRequestModel;
import service.ExaminationNotificationService;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pending_examination")
public class ExaminationNotificationServlet extends HttpServlet {

    @Inject
    ExaminationNotificationService examinationNotificationService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long examinationReqId =Long.parseLong(req.getParameter("id"));
        ExaminationRequestModel examReqModel = examinationNotificationService.getExaminationById(examinationReqId);
        req.setAttribute("examReqModel",examReqModel);
        RequestDispatcher rd=req.getRequestDispatcher("pending_examination.jsp");
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long examReqId = Long.parseLong(req.getParameter("examReqId"));
        String status = req.getParameter("status");
        examinationNotificationService.updateStatus(examReqId,status);
        resp.sendRedirect("doctor");

    }
}
