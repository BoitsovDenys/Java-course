/**
 * Created by Boitsov Denys on 01.07.2021.
 */
public class View {
    public static final String START_MESSAGE = "Hello, it's \"Guess the number\" game";
    public static final String WRONG_DATA = "You entered incorrect data.";
    public static final String LESS_THAN_TARGET_NUMBER = "Your number is lower than the target number ";
    public static final String MORE_THAN_TARGET_NUMBER = "Your number is higher than the target number ";
    public static final String WIN = "You are a winner. It is ";

    public static final String PLEASE_ENTER_BETWEEN_FORMAT = "Please enter an whole number between %d and %d.";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printEnterBetween(int lowerBound,int upperBound) {
        System.out.printf((PLEASE_ENTER_BETWEEN_FORMAT) + "%n", lowerBound, upperBound);
    }
}
