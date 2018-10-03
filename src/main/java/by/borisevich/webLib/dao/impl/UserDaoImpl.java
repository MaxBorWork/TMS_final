package by.borisevich.webLib.dao.impl;

import by.borisevich.webLib.dao.UserDao;
import by.borisevich.webLib.dao.mapper.UserMapper;
import by.borisevich.webLib.model.Login;
import by.borisevich.webLib.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private static final String SQL_INSERT_USER = "INSERT INTO User VALUES(?,?,?,?,?)";

    private static final String SQL_SELECT_ALL_USERS = "SELECT " +
            "id, username, password, userEmail, userCountry FROM User";

    private static final String SQL_SELECT_USERS_BY_USERNAME_PASSWORD = "SELECT " +
            "id, username, password, userEmail, userCountry FROM User " +
            "WHERE username=? AND password=?";

    private static final String SQL_SELECT_USERS_BY_ID = "SELECT " +
            "id, username, password, userEmail, userCountry FROM User " +
            "WHERE id=?";

    private static final String SQL_DELETE_USER = "DELETE FROM User WHERE id =?";

    private static Logger log = LoggerFactory.getLogger(BookDaoImpl.class);

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
        log.info("user " + user.getUsername() + " was created correctly");
    }

    @Override
    public User loginUser(Login login) {
        List<User> users = jdbcTemplate.query(SQL_SELECT_USERS_BY_USERNAME_PASSWORD, new Object[] {
                login.getUsername(),
                login.getPassword()
        }, new UserMapper());
        log.info("Were found " + String.valueOf(users.size()) + " users for login");
        return users.size() > 0 ? users.get(0) : null;
    }

    @Override
    public void deleteUser(int id) {
        List<User> users = jdbcTemplate.query(SQL_SELECT_USERS_BY_ID, new Object[] {id},
                                                new UserMapper());
        log.info("Were found " + String.valueOf(users.size()) + " users for delete");
        if (users.size() > 0) {
            jdbcTemplate.update(SQL_DELETE_USER, new Object[] {id}, new int[] {Types.INTEGER});
        }
    }

    @Override
    public List<User> getUserList() {
        return jdbcTemplate.query(SQL_SELECT_ALL_USERS, new UserMapper());
    }
}
