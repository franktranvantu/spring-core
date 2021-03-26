package com.franktran.service;

import com.franktran.dao.UserDao;
import com.franktran.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(User user) {
        userDao.save(user);
    }

    public List<User> list() {
        return userDao.list();
    }
}
