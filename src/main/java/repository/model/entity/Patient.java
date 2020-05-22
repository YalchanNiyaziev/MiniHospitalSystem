package repository.model.entity;

public class Patient extends Person{

    private String email;

    public Patient() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
