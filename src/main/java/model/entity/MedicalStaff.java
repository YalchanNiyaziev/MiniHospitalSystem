package model.entity;

import model.entity.enums.MedicalSpecializationType;
import model.entity.enums.MedicalWardType;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "medical_staffs")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class MedicalStaff extends User {
    @Column(name = "medical_ward")
    @Enumerated(value = EnumType.STRING)
    private MedicalWardType medicalWard;

    @Enumerated(value = EnumType.STRING)
    private MedicalSpecializationType specialization;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "schedule", referencedColumnName = "id",unique = true)
    private MedicalStaffSchedule schedule;

    @ManyToMany(mappedBy = "team")
    Set<MedicalOperation> operations;

    public MedicalStaff() {
        super();
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

    public Set<MedicalOperation> getOperations() {
        return operations;
    }

    public void setOperations(Set<MedicalOperation> operations) {
        this.operations = operations;
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
