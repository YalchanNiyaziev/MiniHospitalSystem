package controller.model;

public class ListDoctorsModel {
    private int id;
    private String name;
    private String medicalWard;
    private String speciality;

    public ListDoctorsModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalWard() {
        return medicalWard;
    }

    public void setMedicalWard(String medicalWard) {
        this.medicalWard = medicalWard;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "ListDoctorsModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", medicalWard='" + medicalWard + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
