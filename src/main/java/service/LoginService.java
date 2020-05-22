package service;

import controller.model.LoginModel;
import controller.model.UserModel;

public interface LoginService {

    UserModel login(LoginModel loginModel);
}
