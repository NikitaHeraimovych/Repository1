package com.company.java.model;

import com.company.java.view.View;

import java.util.ArrayList;
import java.util.List;

import static com.company.java.view.MessageConstant.*;


public class DBNoteBook {
    List<User> users;

    public DBNoteBook() {
        users = new ArrayList<>();

        users.add(new User("Petro", "HelloWorld"));
        users.add(new User("Dmitro", "Pesel1234"));
    }

    public boolean addUser(User user) throws NotUniqueLoginException{
        if (!users.contains(user)){
            return users.add(user);
        }

        throw new NotUniqueLoginException(View.rb.getString(INPUT_LOGIN_ALREADY_USED), user.getLogin());
    }

}
