import org.junit.Test;

import static org.junit.Assert.*;

public class AssertNullTest {
    Calculator calculator = new Calculator();

    @Test
    public void product1() {
        String prodName = calculator.product(null);
        assertNull(prodName);
    }

    @Test
    public void product2() {
        String prodName = calculator.product("prodName1");
        assertNotNull(prodName);
    }

//    @Test
//    public void product3() {
//        char prodName = calculator.product("prod2").charAt(7);
//        assertNull(prodName);
//    }
//
//    @Test
//    public void product4() {
//        int prodName = calculator.product("prod3").indexOf(9);
//        assertNull(prodName);
//    }
//
//    @Test
//    public void product5() {
//        int prodName = Integer.parseInt(calculator.product("prod1").concat(""));
//        assertNull(prodName);
//    }
}