package day5.firstHalf;

import junit.framework.TestCase;

/**
 * Created by I841059 on 25/04/2016.
 */
public class TestAtLeastThreeVows extends TestCase {

    public void testThreeVowsShouldPass() {
        NiceString ns = new NiceString("aaa");
        assertTrue(ns.containsAtLeastThreeVows());
    }

    public void testThreeVowsShouldPass2() {
        NiceString ns = new NiceString("aei");
        assertTrue(ns.containsAtLeastThreeVows());
    }

    public void testThreeVowsShouldPass3() {
        NiceString ns = new NiceString("ryythrrgayfhttygfyghfeyrtrgythiytrgy");
        assertTrue(ns.containsAtLeastThreeVows());
    }

    public void testThreeVowsShouldNotPass() {
        NiceString ns = new NiceString("aa");
        assertFalse(ns.containsAtLeastThreeVows());
    }
}
