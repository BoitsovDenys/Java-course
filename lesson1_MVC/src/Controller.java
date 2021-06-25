import java.util.Scanner;

/**
 * Created by Boitsov Denys on 24.06.2021.
 */

public class Controller {
    private final Model model;
    private final View view;

    // Constructor
    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println(getMessageToDisplay(sc));
    }

    // The Utility methods
    public String getMessageToDisplay(Scanner sc) {
        while(!model.resultIsReady()) {
            view.printMessage(View.PLEASE_ENTER + model.getTheCurrentWord());
            String userInput = sc.nextLine().trim();
            if (!model.inputValidation(userInput)) {
                view.printMessage(View.INPUT_WORD + userInput);
                view.printMessage(View.WRONG_INPUT_DATA + model.getTheCurrentWord());
            }
        }
        return model.getResult();
    }
}
