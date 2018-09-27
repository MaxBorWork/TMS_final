package by.borisevich.webLib.service.impl;

import by.borisevich.webLib.dao.impl.UserDaoImpl;
import by.borisevich.webLib.model.Login;
import by.borisevich.webLib.model.User;
import by.borisevich.webLib.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDaoImpl userDao;

    @Override
    public void register(User user) {
        userDao.register(user);
    }

    @Override
    public User loginUser(Login login) {

        return userDao.loginUser(login);
    }
}
