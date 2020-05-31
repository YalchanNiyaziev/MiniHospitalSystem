package controller.servlet;

import controller.model.RegisterExaminationModel;
import controller.model.RegisterOperationModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@WebServlet("/register_operation")
public class RegisterOperationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("register_operation.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> params = req.getParameterMap();
        RegisterOperationModel registerOperationModel = createRegisterOperationModel(params);
        HttpSession session = req.getSession();
        session.setAttribute("regOperationModel",registerOperationModel);
        resp.sendRedirect("select_team");
    }

    private RegisterOperationModel createRegisterOperationModel(Map<String, String[]> params) {
        RegisterOperationModel registerOperationModel = new RegisterOperationModel();
        registerOperationModel.setName(params.get("name")[0]);
        registerOperationModel.setAge(Integer.parseInt(params.get("age")[0]));
        registerOperationModel.setEgn(params.get("egn")[0]);
        registerOperationModel.setCity(params.get("city")[0]);
        registerOperationModel.setStreet(params.get("street")[0]);
        registerOperationModel.setStreetNum(Integer.parseInt(params.get("number")[0]));
        registerOperationModel.setDate(params.get("date")[0]);
        registerOperationModel.setDescription(params.get("description")[0]);
        registerOperationModel.setConclusion(params.get("conclusion")[0]);
        registerOperationModel.setPhone(params.get("phone")[0]);
        registerOperationModel.setIdDoctor(Long.parseLong(params.get("doctorId")[0]));
        return registerOperationModel;
    }
}
