package day5.secondHalf;

import junit.framework.TestCase;

/**
 * Created by paulograbin on 25/04/16.
 */
public class TestNiceStringSecondHalf extends TestCase {

    public void testOne() {
        NiceString nc = new NiceString("qjhvhtzxzqqjkmpb");
        assertTrue(nc.isNice());
    }

    public void testTwo() {
        NiceString nc = new NiceString("xxyxx");
        assertTrue(nc.isNice());
    }

    public void testThree() {
        NiceString nc = new NiceString("uurcxstgmygtbstg");
        assertFalse(nc.isNice());
    }

    public void testFour() {
        NiceString nc = new NiceString("ieodomkazucvgmuy");
        assertFalse(nc.isNice());
    }
}
