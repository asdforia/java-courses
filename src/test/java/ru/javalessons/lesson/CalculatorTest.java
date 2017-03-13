package ru.javalessons.lesson;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 */
public class CalculatorTest {

    @Test
    public void testSum() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(5, 7);
        assertEquals(12, calculator.getResult());
    }

    @Test
    public void testDiff() throws Exception {
        Calculator calculator = new Calculator();
        calculator.sub(5, 7);
        assertEquals(-2, calculator.getResult());
    }
}