package com.company.java;

import com.company.java.controller.Controller;
import com.company.java.model.Model;
import com.company.java.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();

        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
