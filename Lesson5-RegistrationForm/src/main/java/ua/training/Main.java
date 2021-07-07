package ua.training;

import ua.training.controller.Controller;
import ua.training.model.Notebook;
import ua.training.view.View;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller(new Notebook(), new View());
        controller.processUser();
    }
}
