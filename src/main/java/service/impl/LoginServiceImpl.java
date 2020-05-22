package service.impl;

import controller.model.LoginModel;
import controller.model.UserModel;
import service.LoginService;

public class LoginServiceImpl implements LoginService {

    private boolean validate(String username, String password) {
        return true;
    }

    @Override
    public UserModel login(LoginModel loginModel) {
        if(validate(loginModel.getUsername(),loginModel.getPassword())){
            UserModel userModel=new UserModel();
            userModel.setRole("DOCTOR");
            return userModel;
        }
        else
        return null;
    }
}
