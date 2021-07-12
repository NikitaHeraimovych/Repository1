package com.company.java.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static com.company.java.view.MessageConstant.*;

public class View {
    private static final String MESSAGE_BUNGLE_NAME = "messages";
    public static final ResourceBundle rb =
            ResourceBundle.getBundle(
                    MESSAGE_BUNGLE_NAME,
                    new Locale("en")
                    //new Locale("ua")
            );

    private void printMessage(String message){
        System.out.println(message);
    }

    public String concatString(String... messages){
        return String.join(" ", messages);
    }

    public void printWrongMessage(String message){
        printMessage(concatString(
                rb.getString(INPUT_WRONG_DATA),
                rb.getString(REPEAT_PLEASE),
                rb.getString(INPUT_DATA),
                rb.getString(message)
        ));
    }

    public void printLoginAlreadyUsed(){
        printMessage(concatString(
                rb.getString(INPUT_LOGIN_ALREADY_USED),
                rb.getString(REPEAT_PLEASE)
        ));
    }

    public void printInputData(String message){
        printMessage(concatString(
                rb.getString(INPUT_DATA),
                rb.getString(message)
        ));
    }
}
