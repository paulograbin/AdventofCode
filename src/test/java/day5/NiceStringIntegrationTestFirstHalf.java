package day5;

import day5.validations.HasAtLeastThreeVowsValidation;
import day5.validations.HasForbiddenLetterCombinationValidation;
import day5.validations.HasTwoLettersInARowValidation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by I841059 on 25/04/2016.
 */
public class NiceStringIntegrationTestFirstHalf {

    private NiceStringTester tester;

    @Before
    public void setUp() {
        tester = new NiceStringTester();
        assertTrue(tester.getTestCount() == 0);

        tester.addTest(new HasAtLeastThreeVowsValidation(), true);
        assertTrue(tester.getTestCount() == 1);

        tester.addTest(new HasTwoLettersInARowValidation(), true);
        assertTrue(tester.getTestCount() == 2);

        tester.addTest(new HasForbiddenLetterCombinationValidation(), false);
        assertTrue(tester.getTestCount() == 3);
    }

    @Test
    public void testOneShouldPass() {
        assertTrue(tester.performTests("ugknbfddgicrmopn"));
    }

    @Test
    public void testTwoShouldPass() {
        assertTrue(tester.performTests("aaa"));
    }

    @Test
    public void testThreeShouldFail() {
        assertFalse(tester.performTests("jchzalrnumimnmhp"));
    }

    @Test
    public void testFourShouldFail() {
        assertFalse(tester.performTests("haegwjzuvuyypxyu"));
    }

    @Test
    public void testFiveShouldFail() {
        assertFalse(tester.performTests("dvszwmarrgswjxmb"));
    }

}
