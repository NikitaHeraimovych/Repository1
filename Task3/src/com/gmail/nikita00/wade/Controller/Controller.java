package com.gmail.nikita00.wade.Controller;

import com.gmail.nikita00.wade.Model.Model;
import com.gmail.nikita00.wade.View.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller (Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner (System.in);

        InputNote inputNote = new InputNote (view, sc);

        inputNote.input();
    }
}
