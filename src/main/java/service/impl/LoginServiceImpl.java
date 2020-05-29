package service.impl;

import controller.model.LoginModel;
import controller.model.UserModel;
import model.entity.User;
import repository.UserRepository;
import service.LoginService;

import javax.inject.Inject;

public class LoginServiceImpl implements LoginService {

    @Inject
    private UserRepository userRepository;

    private User getUser(String username, String password) {
        User user = userRepository.getUserByUsernameAndPassword(username, password);
        return user;
    }

    @Override
    public UserModel login(LoginModel loginModel) {
        User user =getUser(loginModel.getUsername(), loginModel.getPassword());
        if (user != null) {
            UserModel userModel = new UserModel();
            userModel.setRole(user.getUserRole());
            userModel.setName(user.getName());
            userModel.setId(user.getId());
            return userModel;
        } else
            return null;
    }
}
