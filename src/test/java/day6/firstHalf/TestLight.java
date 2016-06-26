package day6.firstHalf;

import junit.framework.TestCase;

/**
 * Created by paulograbin on 27/04/16.
 */
public class TestLight extends TestCase {

    public void testIsOffAfterCreation() {
        Light l = new Light();

        assertEquals(l.getState(), Light.State.OFF);
    }

    public void testTurnOn() {
        Light l = new Light();
        l.turnOn();

        assertEquals(l.getState(), Light.State.ON);
    }

    public void testTurnOff() {
        Light l = new Light();

        l.turnOn();
        l.turnOff();

        assertEquals(l.getState(), Light.State.OFF);
    }

    public void testToggleOneRound() {
        Light l = new Light();

        Light.State previousState = l.getState();

        l.toggle();
        assertNotSame(l.getState(), previousState);
    }

    public void testToggleTwoRounds() {
        Light l = new Light();

        Light.State previousState = l.getState();

        l.toggle();
        l.toggle();
        assertEquals(l.getState(), previousState);
    }

}
