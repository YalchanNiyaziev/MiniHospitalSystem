package repository;

import model.entity.MedicalExamination;

import java.util.List;

public interface MedicalExaminationRepository {
    void save (MedicalExamination examination);
    List<MedicalExamination> getAllExaminationsByEgn(String egn);
}
