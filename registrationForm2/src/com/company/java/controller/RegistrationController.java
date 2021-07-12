package com.company.java.controller;

import com.company.java.model.Model;
import com.company.java.model.NotUniqueLoginException;
import com.company.java.model.User;
import com.company.java.view.View;

import java.util.Scanner;
import static com.company.java.view.MessageConstant.*;

public class RegistrationController {
    Scanner scanner;
    View view;

    public RegistrationController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public User inputForm() {
        String nameRegex = View.rb.getLocale().toString().equals("ru")
                ? RegexConstant.REGEX_NAME_RUS
                : RegexConstant.REGEX_NAME_LAT;

        String name = inputDataWithRegexAndMessage(nameRegex, INPUT_NAME_DATA);

        User user = new User("","");
        createUserAndAddInDataBase(user, name);

        return user;
    }

    private void createUserAndAddInDataBase(User user, String name){
        try {
            user.setName(name);
            user.setLogin(inputDataWithRegexAndMessage(RegexConstant.REGEX_LOGIN, INPUT_LOGIN_DATA));

            Model.db.addUser(user);
        }catch (NotUniqueLoginException notUniqueLoginException){
            view.printLoginAlreadyUsed();
            createUserAndAddInDataBase(user, name);
        }
    }

    private String inputDataWithRegexAndMessage(String regex, String message) {
        view.printInputData(message);
        while (!scanner.hasNext(regex)) {
            view.printWrongMessage(message);
            scanner.next();
        }

        return scanner.next();
    }
}
