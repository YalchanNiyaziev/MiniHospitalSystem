package controller.servlet;

import controller.model.ExaminationRequestModel;
import service.ExaminationRequestService;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/examination_request")
public class ExaminationRequestServlet extends HttpServlet {

    @Inject
    private ExaminationRequestService examinationRequestService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher rd = req.getRequestDispatcher("examination_request.jsp");
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ExaminationRequestModel examinationModel = new ExaminationRequestModel();
        examinationModel.setDoctorId(Integer.parseInt(req.getParameter("doctor_id")));
        examinationModel.setName(req.getParameter("name"));
        examinationModel.setCity(req.getParameter("city"));
        examinationModel.setStreet(req.getParameter("street"));
        examinationModel.setStreetNum(Integer.parseInt(req.getParameter("number")));
        examinationModel.setDate(req.getParameter("date"));
        examinationModel.setTime(req.getParameter("time"));
        examinationModel.setEmail(req.getParameter("email"));
        examinationModel.setPhone(req.getParameter("phone"));
        this.examinationRequestService.makeExaminationRequest(examinationModel);
        resp.sendRedirect("success_request_examination.jsp");
    }
}
