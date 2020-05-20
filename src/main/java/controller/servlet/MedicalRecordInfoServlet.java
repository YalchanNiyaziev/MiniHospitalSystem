package controller.servlet;

import service.MedicalRecordInfoService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/medical_record_info")
public class MedicalRecordInfoServlet extends HttpServlet {

    @Inject
    private MedicalRecordInfoService medicalRecordInfoService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("medical_record");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String egn = req.getParameter("egn");
        if(medicalRecordInfoService.findPatientByEgn(egn)!=null){
            resp.sendRedirect("medical_record_info.jsp");
        }
        else{

        }
    }
}
