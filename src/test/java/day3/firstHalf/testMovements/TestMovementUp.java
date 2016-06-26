package day3.firstHalf.testMovements;

import day3.firstHalf.Movements.Movement;
import day3.firstHalf.Movements.MovementUp;
import day3.firstHalf.Position;
import junit.framework.TestCase;

/**
 * Created by paulograbin on 28/04/16.
 */
public class TestMovementUp extends TestCase {

    Movement m = new MovementUp();

    public void testOnUp() {
        Position p = new Position(0, 0);

        Position newPosition = m.move(p);

        assertEquals(newPosition.getX(), p.getX());
        assertEquals(newPosition.getY(), p.getY()+1);
    }
}
