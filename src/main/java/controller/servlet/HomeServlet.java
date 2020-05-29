package controller.servlet;

import model.entity.Admin;
import model.entity.User;
import model.entity.enums.UserRole;
import repository.impl.AdminRepositoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request,response);

        //response.sendRedirect("index.jsp");
    }
}
