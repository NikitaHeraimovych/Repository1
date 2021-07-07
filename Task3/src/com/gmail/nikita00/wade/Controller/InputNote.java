package com.gmail.nikita00.wade.Controller;

import com.gmail.nikita00.wade.View.View;

import java.util.Scanner;

import static com.gmail.nikita00.wade.Controller.RegexContainer.*;
import static com.gmail.nikita00.wade.View.TextConstant.FIRST_NAME;
import static com.gmail.nikita00.wade.View.TextConstant.LOGIN_DATA;

public class InputNote {
    private View view;
    private Scanner sc;

    private String firstName;
    private String login;

    public InputNote (View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }


    public void input(){
        UtilityController utilityController = new UtilityController (sc, view);

        String str;
        if (String.valueOf(View.bundle.getLocale ()).equals ("ua")) {
            str = REGEX_NAME_UKR;
        }else if (String.valueOf(View.bundle.getLocale ()).equals ("ru")) {
            str = REGEX_NAME_RUS;
        }else
            str = REGEX_NAME_LAT;

        this.firstName =
                utilityController.inputStringValueWithScanner
                        (FIRST_NAME, str);
        this.login =
                utilityController.inputStringValueWithScanner
                        (LOGIN_DATA, REGEX_LOGIN);
    }
}
