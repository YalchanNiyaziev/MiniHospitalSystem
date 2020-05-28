package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "medical_examinations")
public class MedicalExamination extends HealthService {

    @Column
    private String disease;

    @Column(name="medical_opinion")
    private String medicalOpinion;

    public MedicalExamination() {
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getMedicalOpinion() {
        return medicalOpinion;
    }

    public void setMedicalOpinion(String medicalOpinion) {
        this.medicalOpinion = medicalOpinion;
    }

    @Override
    public String toString() {
        return "MedicalExamination{" +
                "disease='" + disease + '\'' +
                ", medicalOpinion='" + medicalOpinion + '\'' +
                '}';
    }
}
