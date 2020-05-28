package model.entity;

import javax.persistence.*;


@Entity
@Table(name="patients")
public class Patient extends Person{

    @Column
    private String email;

    public Patient() {
        this.email="some@abv.bg";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
