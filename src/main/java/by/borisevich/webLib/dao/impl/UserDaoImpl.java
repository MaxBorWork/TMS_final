package by.borisevich.webLib.dao.impl;

import by.borisevich.webLib.dao.UserDao;
import by.borisevich.webLib.dao.mapper.UserMapper;
import by.borisevich.webLib.model.Login;
import by.borisevich.webLib.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private static final String SQL_CREATE_USER_TABLE = "CREATE TABLE IF NOT EXISTS users (" +
            "id int NOT NULL AUTO_INCREMENT," +
            "username varchar(255) NOT NULL," +
            "password varchar(255) NOT NULL," +
            "userEmail varchar(2083)," +
            "userCountry varchar(255)," +
            "PRIMARY KEY (ID)" +
            ");";

    private static final String SQL_INSERT_USER = "INSERT INTO users VALUES(?,?,?,?,?)";

    private static final String SQL_SELECT_USERS_BY_USERNAME_PASSWORD = "SELECT * FROM users " +
            "WHERE username=? AND password=?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void register(User user) {
        jdbcTemplate.update(SQL_INSERT_USER, new Object[]{
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getUserEmail(),
                user.getUserCountry()
        });
    }

    @Override
    public User loginUser(Login login) {
        List<User> users = jdbcTemplate.query(SQL_SELECT_USERS_BY_USERNAME_PASSWORD, new Object[] {
                login.getUsername(),
                login.getPassword()
        }, new UserMapper());
        System.out.println(users.size());
        return users.size() > 0 ? users.get(0) : null;
    }
}
