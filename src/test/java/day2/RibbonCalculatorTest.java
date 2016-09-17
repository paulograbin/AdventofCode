package day2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by i841059 on 9/17/16.
 */
public class RibbonCalculatorTest {

    RibbonCalculator calculator;

    @Test
    public void testSample1() {
        calculator = new RibbonCalculator(2, 3, 4);
        assertEquals(34, calculator.calculateAmountNeeded());
    }

    @Test
    public void testSample2() {
        calculator = new RibbonCalculator(1, 1, 10);
        assertEquals(14, calculator.calculateAmountNeeded());
    }

}
