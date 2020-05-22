package repository.model.entity;

import repository.model.entity.enums.StatusType;

import java.time.LocalDate;

public class ExaminationRequest extends BaseEntity{
    private Patient patient;
    private LocalDate date;
    private StatusType status;

    public ExaminationRequest() {
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

    @Override
    public String toString() {
        return "ExaminationRequest{" +
                "patient=" + patient +
                ", date=" + date +
                ", status=" + status +
                '}';
    }
}
