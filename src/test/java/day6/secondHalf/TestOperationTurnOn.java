package day6.secondHalf;

import junit.framework.TestCase;

/**
 * Created by paulograbin on 27/04/16.
 */
public class TestOperationTurnOn extends TestCase {

    Operation op;

    @Override
    protected void setUp() throws Exception {
        op = new TurnOnOperation();
    }

    public void testOn() {
        Light l = new Light();

        op.execute(l);

        assertEquals(l.getBrightness(), 1);
    }
}
