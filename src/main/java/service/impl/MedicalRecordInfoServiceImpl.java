package service.impl;

import controller.model.MedicalRecordInfoModel;
import model.entity.MedicalExamination;
import model.entity.MedicalOperation;
import repository.MedicalExaminationRepository;
import repository.MedicalOperationRepository;
import service.MedicalRecordInfoService;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class MedicalRecordInfoServiceImpl implements MedicalRecordInfoService {

    @Inject
    private MedicalExaminationRepository examinationRepository;
    @Inject
    private MedicalOperationRepository medicalOperationRepository;

    @Override
    public List<MedicalRecordInfoModel> findPatientByEgn(String egn) {

        List<MedicalRecordInfoModel> modelList = new ArrayList<>();
        List<MedicalExamination> examinationList = examinationRepository.getAllExaminationsByEgn(egn);
        List<MedicalOperation> operationList = medicalOperationRepository.getAllByPatient(egn);
        for (MedicalExamination medEx : examinationList) {
            MedicalRecordInfoModel model = new MedicalRecordInfoModel();
            model.setMedicalRecordDescription(medEx.getDisease());
            model.setMedicalRecordType("Examination");
            model.setDate(medEx.getDate().toString());
            model.setDoctorName(medEx.getDoctor().getName());
            modelList.add(model);
        }
        for (MedicalOperation operation : operationList) {
            MedicalRecordInfoModel model = new MedicalRecordInfoModel();
            model.setMedicalRecordDescription(operation.getProcedureDescription());
            model.setMedicalRecordType("Operation");
            model.setDate(operation.getDate().toString());
            model.setDoctorName(operation.getDoctor().getName());
            modelList.add(model);
        }
        return modelList;
    }
}
