package com.elegantshop.service;

import com.elegantshop.api.UserDao;
import com.elegantshop.api.UserService;
import com.elegantshop.dao.UserDaoImpl;
import com.elegantshop.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private static UserServiceImpl instance = null;
    private UserDao userDao = UserDaoImpl.getInstance();

    private UserServiceImpl() { }

    public static UserServiceImpl getInstance() {
        if (instance == null) {
            instance = new UserServiceImpl();
        }
        return instance;
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public User getUserById(Long userId) {
        List<User> users = getAllUsers();

        for (User user : users
        ) {
            boolean isFoundUser = user.getId().equals(userId);
            if (isFoundUser) {
                return user;
            }

        }

        return null;
    }
}
