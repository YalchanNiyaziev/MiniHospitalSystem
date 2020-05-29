package repository;

import model.entity.Patient;

public interface PatientRepository {
    void save(Patient patient);
    void update(Patient patient);
    Patient getPatientById(long id);
    Patient getPatientByEgn(String egn);
}
