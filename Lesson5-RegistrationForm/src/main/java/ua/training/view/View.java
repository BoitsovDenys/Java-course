package ua.training.view;

import ua.training.model.Subscriber;

import java.util.Locale;
import java.util.ResourceBundle;

import static ua.training.view.TextConstants.*;

public class View {
    static String MESSAGES_BUNDLE_NAME = "messages";

    public static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME,
                    new Locale("ua", "UA"));  // Ukrainian
                    //new Locale("en"));        // English

    /**
     * @param message to print
     */
    public void printMessage(String message) {
        System.out.println(message);
    }


    public void printStringInput(String message) {
        printMessage(
                bundle.getString(INPUT_STRING_DATA) +
                bundle.getString(message));
    }

    public void printWrongStringInput(String message) {
        printMessage(
                bundle.getString(WRONG_INPUT_DATA) +
                bundle.getString(INPUT_STRING_DATA) +
                bundle.getString(message));
    }





    public void printSubscriber(Subscriber subscriber) {
        System.out.println("Surname - " + subscriber.getFirstName() + ";" +
                "\n Nickname - " + subscriber.getLogin());
    }

}
