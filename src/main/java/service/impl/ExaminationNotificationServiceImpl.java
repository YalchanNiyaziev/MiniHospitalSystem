package service.impl;

import controller.model.ExaminationRequestModel;
import model.entity.ExaminationRequest;
import model.entity.enums.StatusType;
import repository.ExaminationRequestRepository;
import service.ExaminationNotificationService;

import javax.inject.Inject;

public class ExaminationNotificationServiceImpl  implements ExaminationNotificationService {

    @Inject
    private ExaminationRequestRepository examinationRequestRepository;


    @Override
    public ExaminationRequestModel getExaminationById(long id) {
        ExaminationRequestModel examReqModel = null;
        ExaminationRequest examinationRequest = examinationRequestRepository.getExaminationReqById(id);
        if (examinationRequest!=null){
            examReqModel = new ExaminationRequestModel();
            examReqModel.setExamReqId(examinationRequest.getId());
            examReqModel.setName(examinationRequest.getPatient().getName());
            examReqModel.setCity(examinationRequest.getPatient().getAddress().getCity());
            examReqModel.setStreet(examinationRequest.getPatient().getAddress().getStreet());
            examReqModel.setStreetNum(examinationRequest.getPatient().getAddress().getNumber());
            examReqModel.setTime(examinationRequest.getTime().toString());
            examReqModel.setDate(examinationRequest.getDate().toString());
            examReqModel.setEmail(examinationRequest.getPatient().getEmail());
            examReqModel.setPhone(examinationRequest.getPatient().getPhone());
        }
        return examReqModel;
    }

    @Override
    public void updateStatus(long id, String status) {
        ExaminationRequest examinationRequest = examinationRequestRepository.getExaminationReqById(id);
        if (status.toLowerCase().equals("approve")){
            examinationRequest.setStatus(StatusType.APPROVED);
        }
        else if (status.toLowerCase().equals("reject")){
            examinationRequest.setStatus(StatusType.REJECTED);
        }
        examinationRequestRepository.update(examinationRequest);
    }
}
