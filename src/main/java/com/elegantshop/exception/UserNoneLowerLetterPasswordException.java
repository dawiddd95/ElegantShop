package com.elegantshop.exception;

public class UserNoneLowerLetterPasswordException extends Exception {
    public UserNoneLowerLetterPasswordException() { }

    public UserNoneLowerLetterPasswordException(String message) {
        super(message);
    }
}
