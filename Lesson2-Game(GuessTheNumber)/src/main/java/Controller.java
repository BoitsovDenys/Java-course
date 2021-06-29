import java.util.Scanner;

public class Controller {
    private final Model model;
    private final View view;
    private Scanner scanner;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void processUser() {
        int numberFromUser;
        int response = 2;
        view.printMessage(View.START_MESSAGE);
        view.printEnterBetween(model.getLowerBound(), model.getUpperBound());
        do {
            numberFromUser = getAttemptFromUser();
            if (model.isBetweenBounds(numberFromUser)) {
                response = model.compareWithTheTargetNumber(numberFromUser);
                view.printGameStatus(response, numberFromUser, model.getLowerBound(), model.getUpperBound(),
                        model.getListOfAttempts().toString());
            } else {
                view.printEnterBetween(model.getLowerBound(), model.getUpperBound());
            }
        } while (response != 0);
    }

    private int getAttemptFromUser() {
        while (!scanner.hasNextInt()) {
            view.printMessage(View.WRONG_DATA);
            view.printEnterBetween(model.getLowerBound(), model.getUpperBound());
            scanner.next();
        }
        return scanner.nextInt();
    }

}
