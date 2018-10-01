package by.borisevich.webLib.service;

import by.borisevich.webLib.model.Login;
import by.borisevich.webLib.model.User;

import java.util.List;

public interface UserService {

    void register(User user);

    User loginUser(Login login);

    void deleteUser(int id);

    List<User> getUserList();
}
