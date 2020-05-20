package controller.model;

public class ExaminationRequestModel {

    private String patientName;
    private String patientCity;
    private String patientStreet;
    private int doctorId;
    private String dateExamination;
    private String patientPhone;
    private String patientEmail;

    public ExaminationRequestModel() {
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientCity() {
        return patientCity;
    }

    public void setPatientCity(String patientCity) {
        this.patientCity = patientCity;
    }

    public String getPatientStreet() {
        return patientStreet;
    }

    public void setPatientStreet(String patientStreet) {
        this.patientStreet = patientStreet;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDateExamination() {
        return dateExamination;
    }

    public void setDateExamination(String dateExamination) {
        this.dateExamination = dateExamination;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    @Override
    public String toString() {
        return "ExaminationRequestModel{" +
                "patientName='" + patientName + '\'' +
                ", patientCity='" + patientCity + '\'' +
                ", patientStreet='" + patientStreet + '\'' +
                ", doctorId=" + doctorId +
                ", dateExamination='" + dateExamination + '\'' +
                ", patientPhone='" + patientPhone + '\'' +
                ", patientEmail='" + patientEmail + '\'' +
                '}';
    }
}
