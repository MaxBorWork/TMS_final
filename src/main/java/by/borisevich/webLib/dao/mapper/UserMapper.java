package by.borisevich.webLib.dao.mapper;

import by.borisevich.webLib.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setUsername(resultSet.getString("username"));
        user.setPassword(resultSet.getString("password"));
        user.setUserEmail(resultSet.getString("userEmail"));
        user.setUserCountry(resultSet.getString("userCountry"));
        return user;
    }
}
