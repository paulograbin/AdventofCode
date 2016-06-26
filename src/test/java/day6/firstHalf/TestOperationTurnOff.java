package day6.firstHalf;

import junit.framework.TestCase;

/**
 * Created by paulograbin on 27/04/16.
 */
public class TestOperationTurnOff extends TestCase {

    Operation op;

    @Override
    protected void setUp() throws Exception {
        op = new TurnOffOperation();
    }

    public void testOn() {
        Light l = new Light();

        op.execute(l);

        assertEquals(l.getState(), Light.State.OFF);
        assertNotSame(l.getState(), Light.State.ON);
    }
}
