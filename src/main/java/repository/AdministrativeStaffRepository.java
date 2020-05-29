package repository;

import model.entity.AdministrativeStaff;
import model.entity.enums.AdministrativeStaffRole;

public interface AdministrativeStaffRepository {
    void save(AdministrativeStaff administrativeStaff);
    void update(AdministrativeStaff staff);
    AdministrativeStaff getStaffByRole(AdministrativeStaffRole role);
}
