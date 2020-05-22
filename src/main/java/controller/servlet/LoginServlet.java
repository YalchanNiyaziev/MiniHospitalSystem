package controller.servlet;

import controller.model.LoginModel;
import controller.model.UserModel;
import service.LoginService;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Inject
    private LoginService loginService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
        rd.forward(request, response);
        //        response.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        LoginModel loginModel = new LoginModel();
        loginModel.setUsername(username);
        loginModel.setPassword(password);
        UserModel userModel = loginService.login(loginModel);
        if (userModel != null) {
            if (userModel.getRole().equals("DOCTOR")) {
                resp.sendRedirect("doctor_home.jsp");
            } else if (userModel.getRole().equals("MEDICAL_STAFF")) {
                resp.sendRedirect("medical_staff_home.jsp");
            } else if (userModel.getRole().equals("MANGER")) {
                resp.sendRedirect("manager_home.jsp");
            } else {
                resp.sendRedirect("admin_home.jsp");
            }
        } else {

        }
    }

}

