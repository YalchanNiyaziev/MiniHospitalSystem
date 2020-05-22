package service.impl;

import controller.model.RegisterExaminationModel;
import service.RegisterExaminationService;

public class RegisterExaminationServiceImpl implements RegisterExaminationService {
    @Override
    public void registerExamination(RegisterExaminationModel registerExaminationModel) {
        System.out.println(registerExaminationModel);
    }
}
