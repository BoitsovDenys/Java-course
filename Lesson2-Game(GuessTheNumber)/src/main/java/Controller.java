import java.util.Scanner;

/**
 * Created by Boitsov Denys on 01.07.2021.
 */
public class Controller {
    private final Model model;
    private final View view;
    private final Scanner scanner;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    // The Work method
    public void processUser() {
        model.setPrimaryBonds(GlobalConstants.PRIMARY_LOWER_BOUND, GlobalConstants.PRIMARY_UPPER_BOUND);
        model.setTargetNumber();
        view.printMessage(View.START_MESSAGE);
        view.printEnterBetween(model.getLowerBound(), model.getUpperBound());

        MatchingUserInputAndTargetValue match;
        while ((match = getMatch()) != MatchingUserInputAndTargetValue.WIN) {
            if (match == MatchingUserInputAndTargetValue.MORE_THAN_THE_TARGET_VALUE) {
                view.printMessage(model.getListOfAttempts().toString());
                view.printMessage(View.MORE_THAN_TARGET_NUMBER);
                view.printEnterBetween(model.getLowerBound(), model.getUpperBound());
            } else {
                view.printMessage(model.getListOfAttempts().toString());
                view.printMessage(View.LESS_THAN_TARGET_NUMBER);
                view.printEnterBetween(model.getLowerBound(), model.getUpperBound());
            }
        }
        view.printMessage(View.WIN + model.getTargetNumber());
    }

    // The Utility methods
    private int getIntFromUser() {
        while (!scanner.hasNextInt()) {
            view.printMessage(View.WRONG_DATA);
            view.printEnterBetween(model.getLowerBound(), model.getUpperBound());
            scanner.next();
        }
        return scanner.nextInt();
    }

    private int getAttemptFromUser(int numberFromUser) {
        if (model.isBetweenBounds(numberFromUser)) {
            return numberFromUser;
        } else {
            view.printEnterBetween(model.getLowerBound(), model.getUpperBound());
            return getAttemptFromUser(getIntFromUser());
        }
    }
    private MatchingUserInputAndTargetValue getMatch() {
        return model.checkAttemptFromUser(getAttemptFromUser(getIntFromUser()));
    }

}
