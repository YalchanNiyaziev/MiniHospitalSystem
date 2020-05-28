package controller.servlet;

import controller.model.ListDoctorsModel;
import service.ListDoctorsService;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list_doctors")
public class ListDoctorsServlet extends HttpServlet {

    @Inject
    private ListDoctorsService listDoctorsService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<ListDoctorsModel> listDoctors=this.listDoctorsService.getAllDoctors();
        if(listDoctors.size()>0) {
            RequestDispatcher rd = req.getRequestDispatcher("list_doctors.jsp");
            req.setAttribute("doctors", listDoctors);
            rd.forward(req, resp);
        }
        else {

        }
    }
}
