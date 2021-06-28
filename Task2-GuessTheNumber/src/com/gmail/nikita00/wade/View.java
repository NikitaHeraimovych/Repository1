package com.gmail.nikita00.wade;

public class View {
    public static final String WRONG_VALUE_ERROR = "You entered incorrect data or an invalid number. Repeat please:";
    public static final String START_MESSAGE = "Hello, it's simple \"Guess the number\" game,\nand you can try to guess number between 0 & 100";

    private static final String NUMBER_LESS_FORMAT = "Your number (%d) is less, input number in diapason between %d and %d \nyour tries: %s";
    private static final String NUMBER_GREATER_FORMAT = "Your number (%d) is greater, input number in diapason between %d and %d\n your tries: %s";
    private static final String WINNER_FORMAT = "You are winner, it is %d";


    public void printMessage(String message){
        System.out.println (message);
    }

    public void printGameInfo(int response, int number, int bottomBound, int upperBound, String tries){
        if (response == 1) {
            System.out.printf ((NUMBER_GREATER_FORMAT) + "%n", number, bottomBound, upperBound, tries);
            return;
        }
        System.out.printf ((NUMBER_LESS_FORMAT) + "%n", number, bottomBound, upperBound, tries);
    }

    public void printGameInfo(int number){
        System.out.printf (WINNER_FORMAT, number);
    }
}