package service;

import controller.model.RegisterOperationModel;
import controller.model.SelectTeamModel;

import java.util.List;

public interface RegisterOperationService {
    List<SelectTeamModel> getAllStaffByWard(long doctorId);

    void registerOperation(RegisterOperationModel registerOperationModel, String[] medicalStaffs);
}
