package com.elegantshop.api;

import com.elegantshop.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);

    void removeUserById(Long id);
    void editUserById(Long id);

    List<User> getAllUsers();
    User getUserById(Long id);
}
