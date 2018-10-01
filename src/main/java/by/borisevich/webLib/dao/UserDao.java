package by.borisevich.webLib.dao;

import by.borisevich.webLib.model.Login;
import by.borisevich.webLib.model.User;

import java.util.List;

public interface UserDao {

    void register (User user);

    User loginUser (Login login);

    void deleteUser(int id);

    List<User> getUserList();
}
