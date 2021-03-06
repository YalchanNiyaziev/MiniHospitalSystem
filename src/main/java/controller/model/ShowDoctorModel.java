package controller.model;

public class ShowDoctorModel {

    private long id;
    private String name;
    private int age;
    private String speciality;
    private String medicalWard;
    private String description;

    public ShowDoctorModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getMedicalWard() {
        return medicalWard;
    }

    public void setMedicalWard(String medicalWard) {
        this.medicalWard = medicalWard;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ShowDoctorModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", speciality='" + speciality + '\'' +
                ", medicalWard='" + medicalWard + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
