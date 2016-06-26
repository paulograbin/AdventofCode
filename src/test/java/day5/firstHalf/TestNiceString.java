package day5.firstHalf;

import junit.framework.TestCase;

/**
 * Created by I841059 on 25/04/2016.
 */
public class TestNiceString extends TestCase {


    public void testOne() {
        NiceString ns = new NiceString("ugknbfddgicrmopn");
        assertTrue(ns.isNice());
    }

    public void testTwo() {
        NiceString ns = new NiceString("aaa");
        assertTrue(ns.isNice());
    }

    public void testThree() {
        NiceString ns = new NiceString("jchzalrnumimnmhp");
        assertFalse(ns.isNice());
    }

    public void testFour() {
        NiceString ns = new NiceString("haegwjzuvuyypxyu");
        assertFalse(ns.isNice());
    }

    public void testFive() {
        NiceString ns = new NiceString("dvszwmarrgswjxmb");
        assertFalse(ns.isNice());
    }

}
