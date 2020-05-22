package repository.model.entity;

import repository.model.entity.enums.MedicalSpecializationType;
import repository.model.entity.enums.MedicalWardType;

public abstract class MedicalStaff extends User {

    private MedicalWardType medicalWard;
    private MedicalSpecializationType specialization;
    private MedicalStaffSchedule schedule;

    public MedicalStaff() {
    }

    public MedicalWardType getMedicalWard() {
        return medicalWard;
    }

    public void setMedicalWard(MedicalWardType medicalWard) {
        this.medicalWard = medicalWard;
    }

    public MedicalSpecializationType getSpecialization() {
        return specialization;
    }

    public void setSpecialization(MedicalSpecializationType specialization) {
        this.specialization = specialization;
    }

    public MedicalStaffSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(MedicalStaffSchedule schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "MedicalStaff{" +
                "medicalWard=" + medicalWard +
                ", specialization=" + specialization +
                ", schedule=" + schedule +
                '}';
    }
}
