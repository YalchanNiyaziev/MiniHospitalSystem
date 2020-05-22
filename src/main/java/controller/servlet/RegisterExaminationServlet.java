package controller.servlet;

import controller.model.RegisterExaminationModel;
import service.RegisterExaminationService;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/register_examination")
public class RegisterExaminationServlet extends HttpServlet {

    @Inject
    private RegisterExaminationService registerExaminationService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("register_medical_examination.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String, String[]> params = req.getParameterMap();
        RegisterExaminationModel registerExaminationModel = createRegisterExaminationModel(params);
        registerExaminationService.registerExamination(registerExaminationModel);
    }

    private RegisterExaminationModel createRegisterExaminationModel(Map<String, String[]> params) {
        RegisterExaminationModel registerExaminationModel = new RegisterExaminationModel();
        registerExaminationModel.setName("name");
        registerExaminationModel.setEgn("egn");
        registerExaminationModel.setCity("city");
        registerExaminationModel.setStreet("street");
        registerExaminationModel.setDate("date");
        registerExaminationModel.setDisease("disease");
        registerExaminationModel.setOpinion("opinion");
        registerExaminationModel.setPhone("phone");
        return registerExaminationModel;
    }
}
