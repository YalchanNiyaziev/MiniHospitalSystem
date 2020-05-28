package model.entity;

import javax.persistence.*;

@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User extends Person {

    @Column
    private String username;

    @Column
    private String password;

    public User() {
        super();

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        User user= (User) o;
        if(user.getEgn().equals(this.username))
            return true;
        else
            return false;
    }


}
