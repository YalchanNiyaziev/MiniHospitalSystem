package service;

import controller.model.MedicalRecordInfoModel;

public interface MedicalRecordInfoService {
    MedicalRecordInfoModel findPatientByEgn( String egn);
}
