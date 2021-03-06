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
        resp.sendRedirect("doctor");
    }

    private RegisterExaminationModel createRegisterExaminationModel(Map<String, String[]> params) {
        RegisterExaminationModel registerExaminationModel = new RegisterExaminationModel();
        registerExaminationModel.setName(params.get("name")[0]);
        registerExaminationModel.setAge(Integer.parseInt(params.get("age")[0]));
        registerExaminationModel.setEgn(params.get("egn")[0]);
        registerExaminationModel.setCity(params.get("city")[0]);
        registerExaminationModel.setStreet(params.get("street")[0]);
        registerExaminationModel.setStreetNum(Integer.parseInt(params.get("number")[0]));
        registerExaminationModel.setDate(params.get("date")[0]);
        registerExaminationModel.setDisease(params.get("disease")[0]);
        registerExaminationModel.setOpinion(params.get("opinion")[0]);
        registerExaminationModel.setPhone(params.get("phone")[0]);
        registerExaminationModel.setIdDoctor(Long.parseLong(params.get("doctorId")[0]));
        return registerExaminationModel;
    }
}
