package controller.model;

public class RegisterExaminationModel {
    private String name;
    private String egn;
    private String city;
    private String street;
    private String date;
    private String disease;
    private String opinion;
    private String phone;
//    private String id;

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

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

    @Override
    public String toString() {
        return "RegisterExaminationModel{" +
                "name='" + name + '\'' +
                ", egn='" + egn + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", date='" + date + '\'' +
                ", disease='" + disease + '\'' +
                ", opinion='" + opinion + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
