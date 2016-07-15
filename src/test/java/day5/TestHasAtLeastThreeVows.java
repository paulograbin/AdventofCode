package day5;

import day5.validations.HasAtLeastThreeVowsValidation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by I841059 on 25/04/2016.
 */
public class TestHasAtLeastThreeVows {

    HasAtLeastThreeVowsValidation test;

    @Before
    public void setUp() {
        test = new HasAtLeastThreeVowsValidation();
    }

    @Test
    public void testThreeVowsShouldPass() {
        assertTrue(test.execute("aaa"));
    }

    @Test
    public void testThreeVowsShouldPass2() {
        assertTrue(test.execute("aei"));
    }

    @Test
    public void testThreeVowsShouldPass3() {
        assertTrue(test.execute("ryythrrgayfhttygfyghfeyrtrgythiytrgy"));
    }

    @Test
    public void testThreeVowsShouldNotPass() {
        assertFalse(test.execute("ae"));
    }
}
