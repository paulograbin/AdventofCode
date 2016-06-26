package day5.firstHalf;

import junit.framework.TestCase;

/**
 * Created by I841059 on 25/04/2016.
 */
public class TestForbiddenCombinations extends TestCase {

    public void testContainABShouldFail() {
        NiceString ns = new NiceString("ab");
        assertTrue(ns.containsForbiddenLetters());
    }

    public void testContainCDShouldFail() {
        NiceString ns = new NiceString("caasdasdcdd");
        assertTrue(ns.containsForbiddenLetters());
    }

    public void testContainPQShouldFail() {
        NiceString ns = new NiceString("aaadasdaspqdasdasdas");
        assertTrue(ns.containsForbiddenLetters());
    }

    public void testContainXYShouldFail() {
        NiceString ns = new NiceString("xy");
        assertTrue(ns.containsForbiddenLetters());
    }

    public void testNotContainingForbiddenShouldPass() {
        NiceString ns = new NiceString("xfsdfsdfy");
        assertFalse(ns.containsForbiddenLetters());
    }

}
