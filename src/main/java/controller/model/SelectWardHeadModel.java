package controller.model;

public class SelectWardHeadModel {

    private String name;
    private String specialization;
    private String egn;
    private boolean isHead;
    private long doctorId;

    public SelectWardHeadModel() {
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

    public boolean isHead() {
        return isHead;
    }

    public void setHead(boolean head) {
        isHead = head;
    }

    public long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(long doctorId) {
        this.doctorId = doctorId;
    }

    @Override
    public String toString() {
        return "SelectWardHeadModel{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", egn='" + egn + '\'' +
                ", isHead=" + isHead +
                ", doctorId=" + doctorId +
                '}';
    }
}
