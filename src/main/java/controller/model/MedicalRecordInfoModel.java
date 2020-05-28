package controller.model;

public class MedicalRecordInfoModel {
    private String medicalRecordDescription;
    private String medicalRecordType;
    private String date;
    private String doctorName;

    public MedicalRecordInfoModel() {
    }

    public String getMedicalRecordDescription() {
        return medicalRecordDescription;
    }

    public void setMedicalRecordDescription(String medicalRecordDescription) {
        this.medicalRecordDescription = medicalRecordDescription;
    }

    public String getMedicalRecordType() {
        return medicalRecordType;
    }

    public void setMedicalRecordType(String getMedicalRecordType) {
        this.medicalRecordType = getMedicalRecordType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "MedicalRecordInfoModel{" +
                "medicalRecordDescription='" + medicalRecordDescription + '\'' +
                ", getMedicalRecordType='" + medicalRecordType + '\'' +
                ", date='" + date + '\'' +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}
