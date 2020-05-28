package model.entity;

import model.entity.enums.AdministrativeStaffRole;

import javax.persistence.*;

@Entity
@Table(name = "administrative_staff")
@Inheritance(strategy = InheritanceType.JOINED)
public class AdministrativeStaff extends User {

    @Enumerated(value = EnumType.STRING)
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
