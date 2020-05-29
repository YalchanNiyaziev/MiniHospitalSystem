package repository;

import model.entity.ExaminationRequest;

import java.util.List;

public interface ExaminationRequestRepository {
    void save(ExaminationRequest examinationRequest);
    void update(ExaminationRequest examinationRequest);
    ExaminationRequest getExaminationReqById(long id);
    List<ExaminationRequest> getExaminationsByDoctor(long doctorId);
    List<ExaminationRequest> getPendingExaminationsByDoctor(long doctorId);
}
