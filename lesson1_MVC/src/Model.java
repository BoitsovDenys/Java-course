/**
 * Created by Boitsov Denys on 24.06.2021.
 */
public class Model {
    // The Constants
    public static String[] EXPECTED_WORDS = {"Hello", "world"};
    private String result;
    private int numberOfСorrectlyEnteredWords;

    // Constructor
    Model() {
        this.result = "";
        this.numberOfСorrectlyEnteredWords = 0;
    }

    public String getResult() {
        return result.trim();
    }

    /**
     *this method checks if the result is ready
     */
    public boolean resultIsReady() {
       if (numberOfСorrectlyEnteredWords == EXPECTED_WORDS.length) {
           return true;
       } else {
           return false;
       }
    }

    /**
     *this method checks the correctness of the input
     *@param input
     */
    public boolean inputValidation(String input) {
        if (input.equals(EXPECTED_WORDS[numberOfСorrectlyEnteredWords])) {
            result += EXPECTED_WORDS[numberOfСorrectlyEnteredWords] + " ";
            numberOfСorrectlyEnteredWords++;
            return true;
        } else {
            return false;
        }
    }

    /**
     *this method returns the current word for input
     */
     public String getTheCurrentWord() {
        return EXPECTED_WORDS[numberOfСorrectlyEnteredWords];
     }
}
