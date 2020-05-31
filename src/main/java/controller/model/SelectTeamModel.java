package controller.model;

public class SelectTeamModel {
    private String name;
    private String specialization;
    private String egn;
    private long medicalStaffId;

    public SelectTeamModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public long getMedicalStaffId() {
        return medicalStaffId;
    }

    public void setMedicalStaffId(long medicalStaffId) {
        this.medicalStaffId = medicalStaffId;
    }
}
