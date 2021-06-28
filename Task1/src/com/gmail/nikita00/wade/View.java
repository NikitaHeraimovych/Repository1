package com.gmail.nikita00.wade;

public class View {
    public static final String START_MESSAGE = "Input \"Hello\" then input \"world!\": ";
    public static final String WRONG_INPUT_DATA = "Wrong input data! Please repeat:";
    public static final String OUR_RESULT = "Our result: ";

    public void printMessage (String message) {
        System.out.println (message);
    }

    public void printMessageAndValue (String message, String value) {
        System.out.println (message + value);
    }

}
