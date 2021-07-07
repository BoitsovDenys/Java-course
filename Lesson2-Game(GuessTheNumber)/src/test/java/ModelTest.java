import org.junit.*;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

/**
 * Created by Boitsov Denys on 02.07.2021.
 */
public class ModelTest {
    private static Model model;
    private int i;
    private int loverBound = 1;
    private int upperBound = 99;

    @Rule
    public Timeout time = new Timeout(10_000, TimeUnit.MILLISECONDS);

    @BeforeClass
    public static void runT() {
        model = new Model();
    }

    @Before
    public void setBoundsAndCounter() {
        model.setPrimaryBonds(loverBound, upperBound);
        i = 0;
    }

    @Test
    public void testSetTargetNumberBeforeLoverBound() {
        while (i <= 1_000_000) {
            int res = model.setTargetNumber();
            Assert.assertNotEquals(loverBound - 1, res);
            i++;
        }
    }

    @Test
    public void testSetTargetNumberAfterUpperBound() {
        while (i <= 1_000_000) {
            int res = model.setTargetNumber();
            Assert.assertNotEquals(upperBound + 1, res);
            i++;
        }
    }

    @Test
    public void testSetTargetNumberLoverBound() {
        boolean res = false;
        while (i <= 1_000_000) {
            if (model.setTargetNumber() == loverBound) {
                res = true;
            }
            i++;
        }
        Assert.assertTrue(res);
    }

    @Test
    public void testSetTargetNumberUpperBound() {
        boolean res = false;
        while (i <= 1_000_000) {
            if (model.setTargetNumber() == upperBound) {
                res = true;
            }
            i++;
        }
        Assert.assertTrue(res);
    }

    @Test
    public void testCheckAttemptFromUserWin() {
        model.setTargetNumber();
        Assert.assertTrue(model.checkAttemptFromUser(model.getTargetNumber()) ==
                MatchingUserInputAndTargetValue.WIN);
    }

    @Ignore
    @Test
    public void testCheckAttemptFromUserLess() {
        model.setTargetNumber();
        Assert.assertTrue(model.checkAttemptFromUser(model.getTargetNumber() - 1) ==
                MatchingUserInputAndTargetValue.LESS_THAN_THE_TARGET_VALUE);
    }

    @Ignore
    @Test
    public void testCheckAttemptFromUserMore() {
        model.setTargetNumber();
       Assert.assertTrue(model.checkAttemptFromUser(model.getTargetNumber() + 1) ==
                MatchingUserInputAndTargetValue.MORE_THAN_THE_TARGET_VALUE);
    }
}
