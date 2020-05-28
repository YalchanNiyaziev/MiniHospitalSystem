package controller.model;

import model.entity.enums.UserRole;

public class UserModel {

    private UserRole role;

    public UserModel() {
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
