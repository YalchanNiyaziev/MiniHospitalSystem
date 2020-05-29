package service.impl;

import controller.model.ExaminationRequestListModel;
import model.entity.ExaminationRequest;
import repository.ExaminationRequestRepository;
import service.ListExaminationRequestsService;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class ListExaminationRequestsServiceImpl implements ListExaminationRequestsService {

    @Inject
    private ExaminationRequestRepository examinationRequestRepository;

    @Override
    public List<ExaminationRequestListModel> getAllExamination(long doctorId) {
        List<ExaminationRequestListModel> examinationModelList = new ArrayList<>();
        List<ExaminationRequest> examinations = examinationRequestRepository.getExaminationsByDoctor(doctorId);
        for(ExaminationRequest er : examinations){
            ExaminationRequestListModel examinationModel = new ExaminationRequestListModel();
            examinationModel.setName(er.getPatient().getName());
            examinationModel.setDate(er.getDate().toString());
            examinationModel.setStatus(er.getStatus().toString());
            examinationModel.setId(er.getId());
            examinationModelList.add(examinationModel);
        }
        return examinationModelList;
    }
}
