package service;

import controller.model.SelectWardHeadModel;

import java.util.List;

public interface SelectWardHeadService {

    List<SelectWardHeadModel> getAllDoctorsByWard(int wardNum);

    void selectHead(long newHeadId, long currentHeadId);
}
