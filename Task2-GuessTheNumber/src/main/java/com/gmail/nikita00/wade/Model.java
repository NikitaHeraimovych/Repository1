package com.gmail.nikita00.wade;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private final List<Integer> tryList = new ArrayList<> ();
    private int randomNumber;
    private int bottomBound;
    private int upperBound;

    public int equalsRandomNumber(int number){
        int response = Integer.compare (number, randomNumber);
        addTryToTryList (number);

        if (response == 0) {
            return response;
        }else if (response == 1) {
            upperBound = number;
            return response;
        }else {
            bottomBound = number;
        }
        return response;
    }

    private void addTryToTryList(int number){
        tryList.add (number);
    }

    public void setPrimaryBarrier(int min, int max){
        this.bottomBound = min;
        this.upperBound = max;
    }

    public void setRandomNumber(){
        randomNumber = (int)Math.ceil (Math.random() * (upperBound - bottomBound - 1) + bottomBound);
    }
    public int getBottomBound () {
        return bottomBound;
    }

    public int getUpperBound () {
        return upperBound;
    }

    public int getRandomNumber () {
        return randomNumber;
    }

    public String getTryListString () {
        return tryList.toString ();
    }
}
