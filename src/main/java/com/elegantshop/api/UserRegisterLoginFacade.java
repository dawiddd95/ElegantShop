package com.elegantshop.api;

import com.elegantshop.model.User;

public interface UserRegisterLoginFacade {
    boolean registerUser(User user);
    boolean loginUser(String login, String password);
}
