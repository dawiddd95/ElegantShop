package com.elegantshop.api;

import com.elegantshop.model.User;

import java.util.List;

public interface UserRegisterLoginFacade {
    boolean registerUser(User user);
    boolean loginUser(String login, String password);

    List<User> getAllUsers();
}
