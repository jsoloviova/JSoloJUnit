import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test(timeout = 10)
    public void timeout(){
        System.out.println(calculator.timeout(0));
    }

    //sum
    @Test
    public void sum1() {
        assertEquals(calculator.sum(3, 2), 5);
    }

    @Test
    public void sum2() {
        assertEquals(calculator.sum(365464, 0), 365464);
    }

    @Test
    public void sum3() {
        assertEquals(calculator.sum(-6, 9), 3);
    }

    //multiply
    @Test
    public void multiply1() {
        assertEquals(calculator.multiply(6, 5), 30);
    }

    @Test
    public void multiply2() {
        assertEquals(calculator.multiply(2, 0), 0);
    }

    @Test
    public void multiply3() {
        assertEquals(calculator.multiply(-6, 9), -54);
    }

    @BeforeClass
    public static void BeforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void AfterClass() {
        System.out.println("After Class");
    }
}