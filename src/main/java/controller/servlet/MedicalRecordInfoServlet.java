package controller.servlet;

import controller.model.MedicalRecordInfoModel;
import service.MedicalRecordInfoService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

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
        List<MedicalRecordInfoModel> medicalRecordInfoModel = medicalRecordInfoService.findPatientByEgn(egn);
        if(medicalRecordInfoModel.size()>0){
            HttpSession session = req.getSession();
            session.setAttribute("patient",medicalRecordInfoModel);
            resp.sendRedirect("medical_record_info.jsp");
        }
        else{

        }
    }
}
