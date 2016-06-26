package day6.secondHalf;

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

        assertEquals(l.getBrightness(), 2);
    }

    public void testTwoRounds() {
        Light l = new Light();

        op.execute(l);
        assertEquals(l.getBrightness(), 2);

        op.execute(l);
        assertEquals(l.getBrightness(), 4);
    }
}
