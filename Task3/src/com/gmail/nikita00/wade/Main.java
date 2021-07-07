package com.gmail.nikita00.wade;

import com.gmail.nikita00.wade.Controller.Controller;
import com.gmail.nikita00.wade.Model.Model;
import com.gmail.nikita00.wade.View.View;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller (new Model(), new View ());
        controller.processUser();
    }
}
