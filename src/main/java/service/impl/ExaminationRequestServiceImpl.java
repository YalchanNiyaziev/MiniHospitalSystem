package service.impl;

import controller.model.ExaminationRequestModel;
import service.ExaminationRequestService;

public class ExaminationRequestServiceImpl implements ExaminationRequestService {
    @Override
    public void makeExaminationRequest(ExaminationRequestModel examinationRequest) {
        System.out.println(examinationRequest);
    }
}
