package ua.training.controller;

import ua.training.model.Notebook;
import ua.training.model.Subscriber;
import ua.training.view.View;

import java.util.Scanner;


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
        NotebookService notebookService = new NotebookService(scanner, view, notebook);
        Subscriber subscriber = new Subscriber();
        notebookService.inputSubscriberToNotebook(subscriber);

        view.printMessage(notebook.getSubscribersList().toString());
    }

    // The Utility methods

}
