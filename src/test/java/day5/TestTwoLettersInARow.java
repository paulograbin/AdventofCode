package day5;

import day5.validations.HasTwoLettersInARowValidation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by I841059 on 25/04/2016.
 */
public class TestTwoLettersInARow {

    HasTwoLettersInARowValidation test;

    @Before
    public void setUp() {
        test = new HasTwoLettersInARowValidation();
    }

    @Test
    public void testHasTwoLettersInARow() {
        assertTrue(test.execute("aa"));
    }

    @Test
    public void testHasTwoLettersInARow2() {
        assertTrue(test.execute("dasdasdasdsadasdadd"));
    }

    @Test
    public void testHasTwoLettersInARow3() {
        assertTrue(test.execute("qwertyuioasddfghjklzxcvbn"));
    }

    @Test
    public void testHasTwoLetterInARow4Fail() {
        assertFalse(test.execute("abc"));
    }

    @Test
    public void testTwoDiffs() {
        assertFalse(test.execute("ab"));
    }
}