package controller.servlet;

import controller.model.RegisterStaffModel;
import service.RegisterMedicalStaffService;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/register_medical_staff")
public class RegisterMedicalStaffServlet extends HttpServlet {

    @Inject
    private RegisterMedicalStaffService registerMedicalStaffService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("register_medical_staff.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String, String[]> parametars = req.getParameterMap();
        RegisterStaffModel registerStaffModel = createRegisterStaffModel(parametars);
        registerMedicalStaffService.register(registerStaffModel);
    }

    private RegisterStaffModel createRegisterStaffModel(Map<String, String[]> params) {
        RegisterStaffModel registerStaffModel = new RegisterStaffModel();
        registerStaffModel.setName(params.get("name")[0]);
        registerStaffModel.setAge(params.get("age")[0]);
        registerStaffModel.setCity(params.get("city")[0]);
        registerStaffModel.setStreet(params.get("street")[0]);
        registerStaffModel.setRole(params.get("role")[0]);
        registerStaffModel.setSpeciality(params.get("speciality")[0]);
        registerStaffModel.setWard(params.get("ward")[0]);
        registerStaffModel.setEmail(params.get("email")[0]);
        registerStaffModel.setPassword(params.get("password")[0]);
        registerStaffModel.setConfirmPassword(params.get("confirmPassword")[0]);
        registerStaffModel.setPhone(params.get("phone")[0]);
        return registerStaffModel;
    }
}
