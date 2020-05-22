package repository.model.entity;

public class MedicalExamination extends HealthService {

    private String disease;
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
