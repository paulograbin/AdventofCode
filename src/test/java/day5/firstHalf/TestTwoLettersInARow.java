package day5.firstHalf;

import junit.framework.TestCase;

/**
 * Created by I841059 on 25/04/2016.
 */
public class TestTwoLettersInARow extends TestCase {

    public void testHasTwoLettersInARow() {
        NiceString ns = new NiceString("aa");
        assertTrue(ns.containsTwoLetterInARow());
    }

    public void testHasTwoLettersInARow2() {
        NiceString ns = new NiceString("dasdasdasdsadasdadd");
        assertTrue(ns.containsTwoLetterInARow());
    }

    public void testHasTwoLettersInARow3() {
        NiceString ns = new NiceString("qwertyuioasddfghjklzxcvbn");
        assertTrue(ns.containsTwoLetterInARow());
    }

    public void testTwoDiffs() {
        NiceString ns = new NiceString("ab");
        assertFalse(ns.containsTwoLetterInARow());
    }
}