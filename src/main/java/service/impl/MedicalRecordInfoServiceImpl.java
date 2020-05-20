package service.impl;

import controller.model.MedicalRecordInfoModel;
import service.MedicalRecordInfoService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MedicalRecordInfoServiceImpl implements MedicalRecordInfoService {
    @Override
    public MedicalRecordInfoModel findPatientByEgn(String egn) {

        MedicalRecordInfoModel model1 = new MedicalRecordInfoModel();
        MedicalRecordInfoModel model2 = new MedicalRecordInfoModel();

        if (egn.equals("1234")) {
            model1.setDate(LocalDate.now().toString());
            model1.setDoctorName("Lasha Sivivk");
            model1.setGetMedicalRecordType("Operation");
            model1.setMedicalRecordDescription("Hearth operation");
            return model1;
        } else if(egn.equals("4321")) {
            model2.setDate(LocalDate.now().toString());
            model2.setDoctorName("The weeknd");
            model2.setGetMedicalRecordType("Examination");
            model2.setMedicalRecordDescription("Rutin examination");
            return model2;
        }
        return null;
    }
}
