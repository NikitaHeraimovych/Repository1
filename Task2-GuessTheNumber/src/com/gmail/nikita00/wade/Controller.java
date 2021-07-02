package com.gmail.nikita00.wade;

import java.util.Scanner;

public class Controller {
    private final Model model;
    private final View view;

    public Controller (Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner (System.in);
        view.printStartMessage (model.getBottomBound (), model.getUpperBound ());
        int number;
        int response;
        while ((response = (model.equalsRandomNumber (number = inputIntWithScanner (sc))))!=0){
            view.printGameInfo (response, number, model.getBottomBound (), model.getUpperBound (), model.getTryListString ());
        }
        view.printGameInfo (number);

    }

    private int inputIntWithScanner(Scanner sc){
        while ( !sc.hasNextInt ()){
            view.printMessage (View.WRONG_VALUE_ERROR);
            sc.next ();
        }
        int res = sc.nextInt ();
        if (res <= model.getUpperBound () && res >= model.getBottomBound ()){
            return res;
        }
        view.printMessage (View.WRONG_VALUE_ERROR);
        return inputIntWithScanner (sc);
    }
}
