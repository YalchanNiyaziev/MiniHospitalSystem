package controller.model;

import model.entity.enums.UserRole;

public class UserModel {

    private long id;
    private UserRole role;
    private String name;

    public UserModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", role=" + role +
                ", name='" + name + '\'' +
                '}';
    }
}
