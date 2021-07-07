package ua.training.controller;

import ua.training.model.Notebook;
import ua.training.model.Subscriber;
import ua.training.view.View;

import java.util.Scanner;

import static ua.training.controller.RegexContainer.*;
import static ua.training.view.TextConstants.FIRST_NAME;
import static ua.training.view.TextConstants.LOGIN_DATA;

public class Controller {

    // Constructor
    private Notebook notebook;
    private View view;
    private Scanner scanner;

    public Controller(Notebook notebook, View view) {
        this.notebook = notebook;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    // The Work method
    public void processUser() {
        inputSubscriberToNotebook();
        view.printMessage(notebook.getSubscribersList().toString());
    }

    // The Utility methods
    private void inputSubscriberToNotebook() {
        UtilityController utilityController = new UtilityController(scanner, view);
        String regexName = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        String firstName = utilityController.inputStringValueWithScanner(FIRST_NAME, regexName);
        String login = utilityController.inputStringValueWithScanner(LOGIN_DATA, REGEX_LOGIN);

        notebook.addSubscriber(new Subscriber(firstName, login));
    }
}
