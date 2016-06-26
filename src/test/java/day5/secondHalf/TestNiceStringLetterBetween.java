package day5.secondHalf;

import junit.framework.TestCase;

/**
 * Created by paulograbin on 25/04/16.
 */
public class TestNiceStringLetterBetween extends TestCase {

    public void testOne() {
        NiceString nc = new NiceString("xyx");
        assertTrue(nc.containsAtLeastOneLetterThatRepearsWithOneInBetween());
    }

    public void testTwo() {
        NiceString nc = new NiceString("abcdefeghi");
        assertTrue(nc.containsAtLeastOneLetterThatRepearsWithOneInBetween());
    }

    public void testThree() {
        NiceString nc = new NiceString("aaa");
        assertTrue(nc.containsAtLeastOneLetterThatRepearsWithOneInBetween());
    }
}
