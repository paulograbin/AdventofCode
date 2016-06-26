package day6.secondHalf;

import junit.framework.TestCase;

/**
 * Created by paulograbin on 27/04/16.
 */
public class TestLight extends TestCase {

    public void testIsOffAfterCreation() {
        Light l = new Light();

        assertEquals(l.getBrightness(), 0);
    }

    public void testTurnOn() {
        Light l = new Light();
        l.turnOn();

        assertEquals(l.getBrightness(), 1);
    }

    public void testTurnOff() {
        Light l = new Light();

        l.turnOn();
        l.turnOff();

        assertEquals(l.getBrightness(), 0);
    }

    public void testToggleOneRound() {
        Light l = new Light();

        l.toggle();
        assertEquals(l.getBrightness(), 2);
    }

    public void testToggleTwoRounds() {
        Light l = new Light();

        l.toggle();
        l.toggle();
        assertEquals(l.getBrightness(), 4);
    }

}
