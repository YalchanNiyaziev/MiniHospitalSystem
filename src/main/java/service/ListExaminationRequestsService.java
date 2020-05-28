package service;

import controller.model.ExaminationRequestListModel;

import java.util.List;

public interface ListExaminationRequestsService {
    List<ExaminationRequestListModel> getAllExamination(long doctorId);
}
