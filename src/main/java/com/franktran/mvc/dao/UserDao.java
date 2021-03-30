package com.franktran.mvc.dao;

import com.franktran.mvc.mapper.UserMapper;
import com.franktran.mvc.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    private final JdbcTemplate jdbcTemplate;
    private final UserMapper userMapper;

    public UserDao(JdbcTemplate jdbcTemplate, UserMapper userMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.userMapper = userMapper;
    }

    public List<User> list() {
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql, userMapper);
    }

    public int save(User user) {
        String sql = "INSERT INTO user (name, email) VALUES (?, ?)";
        return jdbcTemplate.update(sql, new Object[]{user.getName(), user.getEmail()});
    }
}
