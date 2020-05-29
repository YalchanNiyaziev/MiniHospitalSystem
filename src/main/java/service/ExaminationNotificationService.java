package service;

import controller.model.ExaminationRequestModel;

public interface ExaminationNotificationService {
    ExaminationRequestModel getExaminationById(long id);
    void updateStatus(long id, String status);
}
