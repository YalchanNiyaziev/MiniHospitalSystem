package repository;

import model.entity.MedicalStaff;
import model.entity.enums.MedicalWardType;

import java.util.List;

public interface MedicalStaffRepository {
    void save(MedicalStaff medicalStaff);
    void update(MedicalStaff medicalStaff);
    MedicalStaff getStaffById(long staffId);
    List<MedicalStaff> getAllByWard(MedicalWardType ward);
}
