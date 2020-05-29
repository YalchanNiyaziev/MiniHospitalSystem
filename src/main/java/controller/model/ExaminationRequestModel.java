package controller.model;

public class ExaminationRequestModel {
    private long examReqId;
    private String name;
    private String city;
    private String street;
    private int streetNum;
    private long doctorId;
    private String date;
    private String time;
    private String phone;
    private String email;

    public ExaminationRequestModel() {
    }

    public long getExamReqId() {
        return examReqId;
    }

    public void setExamReqId(long examReqId) {
        this.examReqId = examReqId;
    }

    public String getName() {
        return name;
    }

    public void setName(String patientName) {
        this.name = patientName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String patientCity) {
        this.city = patientCity;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String patientStreet) {
        this.street = patientStreet;
    }

    public long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(long doctorId) {
        this.doctorId = doctorId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String dateExamination) {
        this.date = dateExamination;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStreetNum() {
        return streetNum;
    }

    @Override
    public String toString() {
        return "ExaminationRequestModel{" +
                "examReqId=" + examReqId +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", streetNum=" + streetNum +
                ", doctorId=" + doctorId +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }
}
