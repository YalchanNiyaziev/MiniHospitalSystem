package controller.servlet;

import controller.model.RegisterOperationModel;
import controller.model.SelectTeamModel;
import controller.model.UserModel;
import service.RegisterOperationService;

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

@WebServlet("/select_team")
public class SelectTeamServlet extends HttpServlet {

    @Inject
    private RegisterOperationService registerOperationService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        UserModel user = (UserModel) session.getAttribute("user");
        long doctorId = user.getId();
        List<SelectTeamModel> modelList = registerOperationService.getAllStaffByWard(doctorId);
        RequestDispatcher rd = request.getRequestDispatcher("select_team.jsp");
        request.setAttribute("modelList", modelList);
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String[] medicalStaffs = req.getParameterValues("staffId");

        RegisterOperationModel registerOperationModel =
                (RegisterOperationModel) session.getAttribute("regOperationModel");
        registerOperationService.registerOperation(registerOperationModel, medicalStaffs);
        resp.sendRedirect("doctor");
    }
}
