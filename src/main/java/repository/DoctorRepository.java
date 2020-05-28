package repository;


import model.entity.Doctor;
import model.entity.enums.MedicalWardType;
import java.util.List;

public interface DoctorRepository {
    void save(Doctor doctor);
    void update(Doctor doctor);
    Doctor getDoctorById(long id);
    List<Doctor> getAllDoctor();
    List<Doctor> getDoctorsByWard(MedicalWardType ward);

}