package com.elegantshop.api;

import com.elegantshop.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);

    List<User> getAllUsers();
}

