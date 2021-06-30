package com.gmail.nikita00.wade;

public class Main {

    public static void main(String[] args) {
	Model model = new Model (100);
	View view = new View ();
	Controller controller = new Controller (model, view);
	controller.processUser ();
    }
}
