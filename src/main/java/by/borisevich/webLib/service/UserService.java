package by.borisevich.webLib.service;

import by.borisevich.webLib.model.Login;
import by.borisevich.webLib.model.User;

public interface UserService {

    void register(User user);

    User loginUser(Login login);
}
