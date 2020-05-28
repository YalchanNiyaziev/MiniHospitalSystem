package repository;

import model.entity.User;

import java.util.List;

public interface UserRepository {
    List<User> getAllUsers();
    User getUserByUsername(String username);
    User getUserByUsernameAndPassword(String username, String password);
    boolean contains(String username);
    void updatePassword(User user);
}
