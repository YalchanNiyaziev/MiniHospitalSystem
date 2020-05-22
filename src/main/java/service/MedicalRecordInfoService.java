package service;

import controller.model.MedicalRecordInfoModel;

import java.util.List;

public interface MedicalRecordInfoService {
    List<MedicalRecordInfoModel> findPatientByEgn(String egn);
}
