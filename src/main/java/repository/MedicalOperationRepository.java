package repository;

import model.entity.MedicalOperation;

import java.util.List;

public interface MedicalOperationRepository {
    void save(MedicalOperation medicalOperation);
    List<MedicalOperation> getAllByPatient(String egn);
}
