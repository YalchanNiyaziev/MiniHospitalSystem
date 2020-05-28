package model.entity;

import model.entity.enums.HealthProfessionalRole;

import javax.persistence.*;

@Entity
@Table(name="health_professionals")
@Inheritance(strategy = InheritanceType.JOINED)
public class HealthProfessional extends MedicalStaff {

    @Enumerated(value = EnumType.STRING)
    private HealthProfessionalRole role;

    public HealthProfessional() {
    }

    public HealthProfessionalRole getRole() {
        return role;
    }

    public void setRole(HealthProfessionalRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "HealthProfessional{" +
                "role=" + role +
                '}';
    }
}
