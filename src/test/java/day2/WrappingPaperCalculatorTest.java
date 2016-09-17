package day2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WrappingPaperCalculatorTest {

    WrappingPaperCalculator calculator;

    @Test
    public void testSample1() {
        calculator = new WrappingPaperCalculator(2, 3, 4);
        assertEquals(58, calculator.calculateAmountNeeded());
    }

    @Test
    public void testSample2() {
        calculator = new WrappingPaperCalculator(1, 1, 10);
        assertEquals(43, calculator.calculateAmountNeeded());
    }
}
