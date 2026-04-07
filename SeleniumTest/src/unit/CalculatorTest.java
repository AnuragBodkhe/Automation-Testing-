package unit;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(calc.add(2, 3), 5);
    }
}