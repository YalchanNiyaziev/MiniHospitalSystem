package controller.servlet;

import controller.model.ListDoctorsModel;
import service.ListDoctorsService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/list_doctors")
public class ListDoctorsServlet extends HttpServlet {

    @Inject
    private ListDoctorsService listDoctorsService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        StringBuilder sb = new StringBuilder();
        for (ListDoctorsModel model:listDoctorsService.getAllDoctors()){
            sb.append(model.toString());
        }
        out.println(sb.toString());
    }
}
