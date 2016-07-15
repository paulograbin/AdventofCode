package day5;

import day5.validations.AtLeastOneLetterThatRepearsWithOneInBetweenValidation;
import day5.validations.TwoLettersTwiceNotOverlappingValidation;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by paulograbin on 25/04/16.
 */
public class NiceStringIntegrationTestSecondHalf {

    NiceStringTester tester;

    @Before
    public void setUp() throws Exception {
        tester = new NiceStringTester();
        assertTrue(tester.getTestCount() == 0);

        tester.addTest(new TwoLettersTwiceNotOverlappingValidation(), true);
        assertTrue(tester.getTestCount() == 1);

        tester.addTest(new AtLeastOneLetterThatRepearsWithOneInBetweenValidation(), true);
        assertTrue(tester.getTestCount() == 2);
    }

    @Test
    public void testOne() {
        assertTrue(tester.performTests("qjhvhtzxzqqjkmpb"));
    }

    @Test
    public void testTwo() {
        assertTrue(tester.performTests("xxyxx"));
    }

    @Test
    public void testThree() {
        assertFalse(tester.performTests("uurcxstgmygtbstg"));
    }

    @Test
    public void testFour() {
        assertFalse(tester.performTests("ieodomkazucvgmuy"));
    }
}
