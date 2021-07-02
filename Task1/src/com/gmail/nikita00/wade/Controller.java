package com.gmail.nikita00.wade;

import java.util.Scanner;

public class Controller {
    private static final String FIRST_WORD_PATTERN = "Hello";
    private static final String SECOND_WORD_PATTERN = "world!";
    private Model model;
    private View view;
    public Controller (Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner (System.in);
        view.printMessage (View.START_MESSAGE);
        model.addValue (inputValueWithScanner (sc, FIRST_WORD_PATTERN));
        model.addValue (inputValueWithScanner (sc, SECOND_WORD_PATTERN));
        view.printMessageAndValue (View.OUR_RESULT, model.getValue ());
    }

    public String inputValueWithScanner(Scanner sc, String pattern) {
        while( ! sc.hasNext(pattern)) {
            view.printMessage(View.WRONG_INPUT_DATA);
            sc.next();
        }
        return sc.next ();
    }


}