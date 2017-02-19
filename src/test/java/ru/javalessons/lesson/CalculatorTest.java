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
        assertEquals(12, calculator.sum(5, 7));
    }

    @Test
    public void testDiff() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(-2, calculator.diff(5, 7));
    }
}