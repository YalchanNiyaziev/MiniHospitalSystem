package repository.model.entity;

import java.time.LocalDate;

public abstract class HealthService extends BaseEntity{
    private LocalDate date;
    private Patient patient;

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

    @Override
    public String toString() {
        return "HealthService{" +
                "date=" + date +
                ", patient=" + patient +
                '}';
    }
}
