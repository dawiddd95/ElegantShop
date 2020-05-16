package com.elegantshop.exception;

public class UserNoneUpperLetterPasswordException extends Exception {
    public UserNoneUpperLetterPasswordException() { }

    public UserNoneUpperLetterPasswordException(String message) {
        super(message);
    }
}
