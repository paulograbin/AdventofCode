package day5.secondHalf;

import junit.framework.TestCase;

/**
 * Created by paulograbin on 26/04/16.
 */
public class TestTwoLettersNotOverlapping extends TestCase {

    public void testOne() {
        NiceString nc = new NiceString("xyxy");
        assertTrue(nc.twoLettersTwiceNotOverlapping());
    }

    public void testTwo() {
        NiceString nc = new NiceString("aabcdefgaa");
        assertTrue(nc.twoLettersTwiceNotOverlapping());
    }

    public void testThree() {
        NiceString nc = new NiceString("aaa");
        assertFalse(nc.twoLettersTwiceNotOverlapping());
    }
}
