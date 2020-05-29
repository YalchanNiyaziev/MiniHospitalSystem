package model.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
@Inheritance(strategy = InheritanceType.JOINED)
public class Admin extends User{
    public Admin() {
    }
}
