package com.company.java.model;

import java.util.Objects;

public class User {
    private String name;
    private String login;

    public User(String name, String login) {
        this.name = name;
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)){
            return false;
        }

        User user = (User) obj;
        return this.login.equals(user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, login);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
