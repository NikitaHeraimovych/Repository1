package com.company.java.controller;

import com.company.java.model.Model;
import com.company.java.model.User;
import com.company.java.view.View;

import java.util.Scanner;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner scanner = new Scanner(System.in);
        RegistrationController registrationController =
                new RegistrationController(scanner, view);

        User user = registrationController.inputForm();
        System.out.println("\n\n"+user);
    }
}
