package com.elegantshop.model;

public class User {
    private long id;
    private String login;
    private String password;

    private final static String USER_SEPARATOR = " || ";

    public User(long id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return id + USER_SEPARATOR + login + USER_SEPARATOR + password;
    }
}
