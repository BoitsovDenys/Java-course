import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

public class TestArifmetics {
    private final double DELTA = 0.00000001;
    private static Arifmetics a;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout time = new Timeout(1000, TimeUnit.MILLISECONDS);

    @BeforeClass
    public static void runT() {
        a = new Arifmetics();
    }

    @Test
    public void testAdd() {
        Arifmetics a = new Arifmetics();
        double res = a.add(3,7);
        Assert.assertEquals(res,10.0, DELTA);
    }

    @Test
    public void testMult() {
        Arifmetics a = new Arifmetics();
        double res = a.mult(3,7);
        Assert.assertEquals(res,21.0, DELTA);
    }

    @Ignore
    @Test
    public void testDeduct() {
        Arifmetics a = new Arifmetics();
        double res = a.deduct(3,7);
        Assert.assertEquals(res,-4.0, DELTA);
    }

    @Test
    public void testDiv() {
        Arifmetics a = new Arifmetics();
        double res = a.div(10,5);
        Assert.assertEquals(res,2.0, DELTA);
    }

    //@Test(expected = ArithmeticException.class)
    @Test
    public void testDivExeption() {
        exp.expect(ArithmeticException.class);
        a.div(10.0, 0.0);
    }

    @Test
    public void testN() {
        while (true) { }
    }
}
