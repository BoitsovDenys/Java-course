import java.util.ArrayList;
import java.util.List;

public class Model {
    private final int targetNumber;
    private final List<Integer> listOfAttempts;
    private int upperBound;
    private int lowerBound;

    public Model() {
        targetNumber = (int) (Math.random()*101);
        listOfAttempts = new ArrayList<>();
        upperBound = 100;
        lowerBound = 0;
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

    public int compareWithTheTargetNumber(int numberFromUser) {
        int response = Integer.compare(numberFromUser, targetNumber);
        if (response == 0) {
            return response;
        } else if (response == 1) {
            upperBound = numberFromUser - 1;
            listOfAttempts.add(numberFromUser);
            return response;
        } else {
            lowerBound = numberFromUser + 1;
            listOfAttempts.add(numberFromUser);
            return response;
        }
    }

    public boolean isBetweenBounds(int numberFromUser) {
        if ((numberFromUser<=upperBound) && (numberFromUser>=lowerBound)) {
            return true;
        } else {
            return false;
        }
    }
}
