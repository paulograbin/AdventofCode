package day3.secondHalf.testMovements;

import day3.secondHalf.Movements.Movement;
import day3.secondHalf.Movements.MovementRight;
import day3.secondHalf.Position;
import junit.framework.TestCase;

/**
 * Created by paulograbin on 28/04/16.
 */
public class TestMovementRight extends TestCase {

    Movement m = new MovementRight();

    public void testOnUp() {
        Position p = new Position(0, 0);

        Position newPosition = m.move(p);

        assertEquals(newPosition.getX(), p.getX()+1);
        assertEquals(newPosition.getY(), p.getY());
    }
}
