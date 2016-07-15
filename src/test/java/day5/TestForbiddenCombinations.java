package day5;

import day5.validations.HasForbiddenLetterCombinationValidation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by I841059 on 25/04/2016.
 */
public class TestForbiddenCombinations {

    HasForbiddenLetterCombinationValidation test;

    @Before
    public void setUp() throws Exception {
        test = new HasForbiddenLetterCombinationValidation();
    }

    @Test
    public void testContainABShouldFail() {
        assertTrue(test.execute("ab"));
    }

    @Test
    public void testContainCDShouldFail() {
        assertTrue(test.execute("caasdasdcdd"));
    }

    @Test
    public void testContainPQShouldFail() {
        assertTrue(test.execute("aaaadasdaspqdasdasdasb"));
    }

    @Test
    public void testContainXYShouldFail() {
        assertTrue(test.execute("xy"));
    }

    @Test
    public void testNotContainingForbiddenShouldPass() {
        assertFalse(test.execute("xfsdfsdfy"));
    }
}
