package com.franktran.service;

import com.franktran.dao.UserDao;
import com.franktran.model.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private static final Logger LOGGER = Logger.getLogger(UserService.class);

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(User user) {
        LOGGER.info(String.format("Going to create user: %s", user));
        userDao.save(user);
        LOGGER.info("Created user successful!");
    }

    public List<User> list() {
        LOGGER.info("Going to get all users");
        return userDao.list();
    }
}
