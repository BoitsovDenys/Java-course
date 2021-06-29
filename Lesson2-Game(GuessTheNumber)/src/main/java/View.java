public class View {
    public static final String START_MESSAGE = "Hello, it's \"Guess the number\" game";
    public static final String WRONG_DATA = "You entered incorrect data.";
    public static final String LOWER_THAN_TARGET_NUMBER = "Your number is lower than the target number ";
    public static final String HIGHER_THAN_TARGET_NUMBER = "Your number is higher than the target number ";

    public static final String PLEASE_ENTER_BETWEEN_FORMAT = "Please enter an whole number between %d and %d.";
    public static final String WIN_FORMAT = "You are a winner. It is %d";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printEnterBetween(int lowerBound,int upperBound) {
        System.out.printf((PLEASE_ENTER_BETWEEN_FORMAT) + "%n", lowerBound, upperBound);
    }

    public void printGameStatus(int response, int numberFromUser, int lowerBound, int upperBound, String listOfAttempts) {
        if (response == 1) {
            System.out.println(listOfAttempts);
            System.out.println(HIGHER_THAN_TARGET_NUMBER);
            printEnterBetween(lowerBound, upperBound);
        } else if (response == -1) {
            System.out.println(listOfAttempts);
            System.out.println(LOWER_THAN_TARGET_NUMBER);
            printEnterBetween(lowerBound, upperBound);
        } else if (response == 0) {
            System.out.println(listOfAttempts);
            System.out.printf(WIN_FORMAT, numberFromUser);
        }
    }
}
