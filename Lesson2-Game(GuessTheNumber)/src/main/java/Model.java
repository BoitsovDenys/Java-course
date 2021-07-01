import java.util.ArrayList;
import java.util.List;

/**
 * Created by Boitsov Denys on 01.07.2021.
 */
public class Model {
    // Data
    private int targetNumber;
    private final List<Integer> listOfAttempts;
    private int upperBound;
    private int lowerBound;

    public Model() {
        listOfAttempts = new ArrayList<>();
    }

    // [1-99]
    public int setTargetNumber() {
        targetNumber = (int)Math.ceil(Math.random() *
                (upperBound - lowerBound + 1) + lowerBound - 1);
        return  targetNumber;
    }

    public void setPrimaryBonds(int lowerBound, int upperBound){
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public MatchingUserInputAndTargetValue checkAttemptFromUser(int attemptFromUser) {
        int response = Integer.compare(attemptFromUser, targetNumber);
        if (response == 0) {
            return MatchingUserInputAndTargetValue.WIN;
        } else if (response == 1) {
            upperBound = attemptFromUser - 1;
            listOfAttempts.add(attemptFromUser);
            return MatchingUserInputAndTargetValue.LESS_THAN_THE_TARGET_VALUE;
        } else {
            lowerBound = attemptFromUser + 1;
            listOfAttempts.add(attemptFromUser);
            return MatchingUserInputAndTargetValue.MORE_THAN_THE_TARGET_VALUE;
        }
    }

    public boolean isBetweenBounds(int numberFromUser) {
        return (numberFromUser <= upperBound) && (numberFromUser >= lowerBound);
    }

    public List<Integer> getListOfAttempts() {
            return listOfAttempts;
    }

    public int getUpperBound() {
            return upperBound;
    }

    public int getLowerBound() {
            return lowerBound;
    }

    public int getTargetNumber() {
        return targetNumber;
    }
}
