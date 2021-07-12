package ua.training.controller;

import ua.training.model.Notebook;
import ua.training.model.Subscriber;
import ua.training.model.exceptions.NotUniqueLoginException;
import ua.training.view.View;

import java.util.Scanner;

import static ua.training.controller.RegexContainer.*;
import static ua.training.view.TextConstants.FIRST_NAME;
import static ua.training.view.TextConstants.LOGIN_DATA;

public class NotebookService {
    private Scanner scanner;
    private View view;
    private Notebook notebook;

    String regexName = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_NAME_UKR : REGEX_NAME_LAT;

    public NotebookService(Scanner scanner, View view, Notebook notebook) {
        this.scanner = scanner;
        this.view = view;
        this.notebook = notebook;
    }

    public void inputSubscriberToNotebook(Subscriber subscriber) {
        UtilityController utilityController = new UtilityController(scanner, view);

        inputFirstName(subscriber);
        inputLogin(subscriber);

        notebook.addSubscriber(subscriber);
    }

    public void inputFirstName(Subscriber subscriber) {
        UtilityController utilityController = new UtilityController(scanner, view);
        String firstName = utilityController.inputStringValueWithScanner(FIRST_NAME, regexName);
        subscriber.setFirstName(firstName);
    }

    public void inputLogin(Subscriber subscriber) {
        UtilityController utilityController = new UtilityController(scanner, view);
        String login;
        while(true) {
            try {
                login = utilityController.inputStringValueWithScanner(LOGIN_DATA, REGEX_LOGIN);
                subscriber.setLogin(login);
                break;
            } catch (NotUniqueLoginException e) {
                e.printStackTrace();
                System.out.println(e.getMessage() + "-" + e.getLoginData());
            }
        }
    }
}
