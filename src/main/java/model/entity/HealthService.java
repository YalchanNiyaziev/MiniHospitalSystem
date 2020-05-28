package model.entity;

import javax.persistence.*;
import java.time.LocalDate;

//@MappedSuperclass
@Entity
@Table(name="health_services")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class HealthService extends BaseEntity{

    @Column
    private LocalDate date;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="patient_id",referencedColumnName = "id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name="doctor_id",referencedColumnName = "id")
    private Doctor doctor;
    public HealthService() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "HealthService{" +
                "date=" + date +
                ", patient=" + patient +
                ", doctor=" + doctor +
                '}';
    }
}
