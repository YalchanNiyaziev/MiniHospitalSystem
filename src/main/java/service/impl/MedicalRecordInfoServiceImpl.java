package service.impl;

import controller.model.MedicalRecordInfoModel;
import model.entity.MedicalExamination;
import repository.MedicalExaminationRepository;
import service.MedicalRecordInfoService;

import javax.inject.Inject;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MedicalRecordInfoServiceImpl implements MedicalRecordInfoService {

    @Inject
    private MedicalExaminationRepository examinationRepository;


    @Override
    public List<MedicalRecordInfoModel> findPatientByEgn(String egn) {

        //Napravi go s HealthService s Join

        List<MedicalRecordInfoModel> modelList = new ArrayList<>();
        List<MedicalExamination> examinationList = examinationRepository.getAllExaminationsByEgn(egn);
        for (MedicalExamination medEx : examinationList) {
            MedicalRecordInfoModel model = new MedicalRecordInfoModel();
            model.setMedicalRecordDescription(medEx.getDisease());
            model.setMedicalRecordType("Examination");
            model.setDate(medEx.getDate().toString());
            medEx.getDoctor();
            model.setDoctorName(medEx.getDoctor().getName());
            modelList.add(model);
        }
        return modelList;
    }
}
