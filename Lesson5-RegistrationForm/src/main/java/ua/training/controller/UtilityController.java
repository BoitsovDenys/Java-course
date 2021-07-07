package ua.training.controller;

import java.util.Scanner;
import ua.training.view.View;


public class UtilityController {
    private Scanner scanner;
    private View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    String inputStringValueWithScanner(String message, String regex) {
        String result;
        view.printStringInput(message);
        while( !(scanner.hasNext() && (result = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }
        return result;
    }
}
