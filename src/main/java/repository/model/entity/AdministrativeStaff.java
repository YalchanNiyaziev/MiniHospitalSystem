package repository.model.entity;

import repository.model.entity.enums.AdministrativeStaffRole;

public  class AdministrativeStaff extends User {
    private AdministrativeStaffRole role;

    public AdministrativeStaff() {
    }

    public AdministrativeStaffRole getRole() {
        return role;
    }

    public void setRole(AdministrativeStaffRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "AdministrativeStaff{" +
                "role=" + role +
                '}';
    }
}
