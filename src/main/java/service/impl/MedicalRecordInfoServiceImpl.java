package service.impl;

import controller.model.MedicalRecordInfoModel;
import service.MedicalRecordInfoService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MedicalRecordInfoServiceImpl implements MedicalRecordInfoService {
    @Override
    public List<MedicalRecordInfoModel> findPatientByEgn(String egn) {
        List<MedicalRecordInfoModel> list= new ArrayList<>();
        MedicalRecordInfoModel model1 = new MedicalRecordInfoModel();
        MedicalRecordInfoModel model2 = new MedicalRecordInfoModel();
        MedicalRecordInfoModel model3 = new MedicalRecordInfoModel();


        if (egn.equals("1234")) {
            model1.setDate(LocalDate.now().toString());
            model1.setDoctorName("Lasha Sivivk");
            model1.setGetMedicalRecordType("Operation");
            model1.setMedicalRecordDescription("Hearth operation");

            model3.setDate(LocalDate.now().toString());
            model3.setDoctorName("Maria Kyuri");
            model3.setGetMedicalRecordType("Examination");
            model3.setMedicalRecordDescription("UNG examination");
            list.add(model3);
            list.add(model1);
        } else if(egn.equals("4321")) {
            model2.setDate(LocalDate.now().toString());
            model2.setDoctorName("The weeknd");
            model2.setGetMedicalRecordType("Examination");
            model2.setMedicalRecordDescription("Rutin examination");
            list.add(model2);
        }
        return list;
    }
}
