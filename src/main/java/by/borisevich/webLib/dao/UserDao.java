package by.borisevich.webLib.dao;

import by.borisevich.webLib.model.Login;
import by.borisevich.webLib.model.User;

public interface UserDao {

    void register (User user);

    User loginUser (Login login);
}
