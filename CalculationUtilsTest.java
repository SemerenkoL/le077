import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationUtilsTest {
    int x;
    int y;

    @Before
    public void setUp()  {
        x = 5;
        y =7;

    }

    @Test
    public void add() {
        int result = 13;
        Assert.assertEquals("5 + 7 must be equals 12", result, CalculationUtils.add(x,y) );
    }

    @Test
    public void sub() {
        int result = -2;
        Assert.assertEquals(result, CalculationUtils.sub(x,y));
    }
}