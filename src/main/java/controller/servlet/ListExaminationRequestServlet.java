package controller.servlet;

import controller.model.ExaminationRequestListModel;
import service.ListExaminationRequestsService;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/list_examination_request")
public class ListExaminationRequestServlet extends HttpServlet {

    @Inject
    private ListExaminationRequestsService listExamReqService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long doctorId = Long.parseLong(req.getParameter("doctorId"));
        RequestDispatcher rd = req.getRequestDispatcher("list_examination_request.jsp");
        List<ExaminationRequestListModel> modelList = listExamReqService.getAllExamination(doctorId);
        if(modelList.size()>0){
        req.setAttribute("examReqList",modelList);
        rd.forward(req,resp);
        }
        else {

        }
    }

}
