package day5;

import day5.validations.AtLeastOneLetterThatRepearsWithOneInBetweenValidation;
import day5.validations.StringValidation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by paulograbin on 25/04/16.
 */
public class TestNiceStringLetterBetween {

    StringValidation tester;

    @Before
    public void setUp() throws Exception {
        tester = new AtLeastOneLetterThatRepearsWithOneInBetweenValidation();
    }

    @Test
    public void testOne() {
        assertTrue(tester.execute("xyx"));
    }

    @Test
    public void testTwo() {
        assertTrue(tester.execute("abcdefeghi"));
    }

    @Test
    public void testThree() {
        assertTrue(tester.execute("aaa"));
    }

    @Test
    public void testFour() {
        assertFalse(tester.execute("abc"));
    }
}
