package day6.firstHalf;

import junit.framework.TestCase;

/**
 * Created by paulograbin on 27/04/16.
 */
public class TestOperationToggle extends TestCase {

    Operation op;

    @Override
    protected void setUp() throws Exception {
        op = new ToggleOperation();
    }

    public void testOneRound() {
        Light l = new Light();

        op.execute(l);

        assertEquals(l.getState(), Light.State.ON);
    }

    public void testTwoRounds() {
        Light l = new Light();

        op.execute(l);
        assertEquals(l.getState(), Light.State.ON);

        op.execute(l);
        assertEquals(l.getState(), Light.State.OFF);
    }
}
