import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(value = Parameterized.class)
public class ParameterizedTest {
    Calculator calculator = new Calculator();
    @Parameterized.Parameter(0)
    public int t;

    @Parameterized.Parameters(name = "{index}: Test with m1={0}, m2 ={1}, result is:{2} ")
    public static Object[] data() {
        return new Object[] { 5 };
    }

    @Test
    public void isOdd() {
        assertTrue(calculator.isOdd(t));
        System.out.println();
    }
}