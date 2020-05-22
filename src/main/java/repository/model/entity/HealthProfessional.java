package repository.model.entity;

import repository.model.entity.enums.HealthProfessionalRole;

public class HealthProfessional extends MedicalStaff {
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
