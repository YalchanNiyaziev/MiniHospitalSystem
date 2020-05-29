package controller.model;

public class RegisterExaminationModel {
    private String name;
    private String egn;
    private int age;
    private String city;
    private String street;
    private int streetNum;
    private String date;
    private String disease;
    private String opinion;
    private String phone;
    private long idDoctor;

    public RegisterExaminationModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(long idDoctor) {
        this.idDoctor = idDoctor;
    }

    @Override
    public String toString() {
        return "RegisterExaminationModel{" +
                "name='" + name + '\'' +
                ", egn='" + egn + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", streetNum=" + streetNum +
                ", date='" + date + '\'' +
                ", disease='" + disease + '\'' +
                ", opinion='" + opinion + '\'' +
                ", phone='" + phone + '\'' +
                ", idDoctor=" + idDoctor +
                '}';
    }
}
