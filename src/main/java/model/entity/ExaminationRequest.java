package model.entity;

import model.entity.enums.StatusType;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "examination_request")
public class ExaminationRequest extends BaseEntity {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient", referencedColumnName = "id")
    private Patient patient;

    @Column
    private LocalDate date;

    @Column
    private LocalTime time;

    @Enumerated(value = EnumType.STRING)
    private StatusType status;

    //    @ManyToOne(cascade = CascadeType.MERGE)
    @ManyToOne
    @JoinColumn(name = "doctor", referencedColumnName = "id")
    private Doctor doctor;

    public ExaminationRequest() {
        this.date = LocalDate.now();
        this.status = StatusType.REJECTED;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ExaminationRequest{" +
                "patient=" + patient +
                ", date=" + date +
                ", time=" + time +
                ", status=" + status +
                ", doctor=" + doctor +
                '}';
    }
}
