package com.company.java.model;

public class NotUniqueLoginException extends Exception{
    private String login;

    public NotUniqueLoginException(String message, String login) {
        super(message);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}
