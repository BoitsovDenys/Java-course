/**
 * Created by Boitsov Denys on 24.06.2021.
 */
public class Model {
    private String[] expectedWords = {"Hello", "world"};
    private String result = "";
    private int numberOfСorrectlyEnteredWords = 0;

    public String getResult() {
        return result.trim();
    }

    /**
     *this method checks if the result is ready
     */
    public boolean resultIsReady() {
       if (numberOfСorrectlyEnteredWords == expectedWords.length) {
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
        if (input.equals(expectedWords[numberOfСorrectlyEnteredWords])) {
            result += expectedWords[numberOfСorrectlyEnteredWords] + " ";
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
        return expectedWords[numberOfСorrectlyEnteredWords];
     }
}
