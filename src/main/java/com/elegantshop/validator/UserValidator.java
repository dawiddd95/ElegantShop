package com.elegantshop.validator;

import com.elegantshop.exception.*;
import com.elegantshop.model.User;

import java.util.function.IntPredicate;

public class UserValidator {
    private static UserValidator instance = null;

    private final int MIN_LENGTH_PASSWORD = 8;
    private final int MIN_LENGTH_LOGIN = 6;

    private UserValidator() { }

    public static UserValidator getInstance() {
        if (instance == null) {
            instance = new UserValidator();
        }

        return instance;
    }

    public boolean isValidate(User user) throws UserShortLengthLoginException, UserNoneUpperLetterPasswordException, UserNoneNumberPasswordException, UserShortLengthPasswordException, UserNoneLowerLetterPasswordException {
        if(!isLoginLengthEnough(user.getLogin()))
            throw new UserShortLengthLoginException("Login must contain at least 6 characters.");

        if(!isPasswordLengthEnough(user.getPassword()))
            throw new UserShortLengthPasswordException("Password must contain at least 8 characters.");

        if(!isPasswordContainUpperLetter(user.getPassword()))
            throw new UserNoneUpperLetterPasswordException("Password must contain at least one upper letter.");

        if(!isPasswordContainLowerLetter(user.getPassword()))
            throw new UserNoneLowerLetterPasswordException("Password must contain at least one lower letter.");

        if(!isPasswordContainNumber(user.getPassword()))
            throw new UserNoneNumberPasswordException("Password must contain at least one number");

        return true;
    }

    private boolean isLoginLengthEnough(String login) {
        return login.length() >= MIN_LENGTH_LOGIN;
    }

    private boolean isPasswordLengthEnough(String password) {
        return password.length() >= MIN_LENGTH_PASSWORD;
    }

    private boolean contains(String value, IntPredicate predicate) {
        return value.chars().anyMatch(predicate);
    }

    private boolean isPasswordContainUpperLetter(String password) {
        return contains(password, i -> Character.isLetter(i) && Character.isUpperCase(i));
    }

    private boolean isPasswordContainLowerLetter(String password) {
        return contains(password, i -> Character.isLetter(i) && Character.isLowerCase(i));
    }

    private boolean isPasswordContainNumber(String password) {
        return contains(password, Character::isDigit);
    }
}
