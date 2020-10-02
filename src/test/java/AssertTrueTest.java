import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AssertTrueTest {
    Calculator calculator = new Calculator();

    //isEven

    @ValueSource(strings = {"1", "2"})
    @After
    @Test
    public void isEven1(String[] m) {
        System.out.println(m);
        assertTrue(calculator.isEven(14, 66));
        System.out.println("After");
    }

    @After
    @Test
    public void isEven2() {
        assertTrue(calculator.isEven(15, 67));
    }

    @After
    @Test
    public void isEven3() {
        assertTrue(calculator.isEven(-14, -66));
    }

    @After
    @Test
    public void isEven4() {
        assertTrue(calculator.isEven(-5, 5));
    }

    @After
    @Test
    public void isEven5() {
        assertFalse(calculator.isEven(21, 66));
    }

    //arrIsShort
    @Before
    @Test
    public void arrIsShort1() {
        Integer[] arr = {};
        assertTrue(calculator.arrIsShort(arr));
        System.out.println("Before");
    }

    @Before
    @Test
    public void arrIsShort2() {
        Integer[] arr = {1, 2, 3, 4, 5};
        assertTrue(calculator.arrIsShort(arr));
    }

    @Before
    @Test
    public void arrIsShort3() {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11, 12};
        assertFalse(calculator.arrIsShort(arr));
    }

}