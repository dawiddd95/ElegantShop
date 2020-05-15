package com.elegantshop.validator;

import com.elegantshop.model.User;

public class UserValidator {
    private static UserValidator instance = null;

    private UserValidator() { }

    public static UserValidator getInstance() {
        if (instance == null) {
            instance = new UserValidator();
        }

        return instance;
    }

//    public boolean isValidate(User user) throws UserShortLengthLoginException, UserShortLengthPasswordException {
//        if (isPasswordLengthNoEnough(user.getPassword()))
//            throw new UserShortLengthPasswordException("Password is too short.");
//
//        if (isLoginLengthNoEnough(user.getLogin()))
//            throw new UserShortLengthLoginException("Login is too short.");
//
//        return true;
//    }

    // główny validator
    public boolean isValidate(User user) {
        return true;
    }

}
