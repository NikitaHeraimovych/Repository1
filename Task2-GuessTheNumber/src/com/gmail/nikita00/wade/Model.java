package com.gmail.nikita00.wade;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private final int randomNumber;
    private final List<Integer> tryList;
    private int bottomBound;
    private int upperBound;

    public Model () {
        tryList = new ArrayList<> ();
        bottomBound = 0;
        upperBound = 100;
        randomNumber = (int)(Math.random ()*101);
    }

    public int equalsRandomNumber(int number){
        int response = Integer.compare (number, randomNumber);
        if (response == 0) {
            return response;
        }else if (response == 1) {
            addTryToTryList (number);
            upperBound = number;
            return response;
        }else bottomBound = number;
        addTryToTryList (number);
        return response;
    }

    private void addTryToTryList(int number){
        tryList.add (number);
    }

    public int getBottomBound () {
        return bottomBound;
    }

    public int getUpperBound () {
        return upperBound;
    }


    public String getTryListString () {
        return tryList.toString ();
    }
}
