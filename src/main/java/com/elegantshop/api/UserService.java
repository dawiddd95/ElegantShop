package com.elegantshop.api;

import com.elegantshop.model.User;

import java.util.List;

public interface UserService {
    boolean addUser(User user);

    List<User> getAllUsers();
    User getUserById(Long id);
    User getUserByLogin(String login);

    boolean isCorrectLoginAndPassword(String login, String password);
}
