package day3.firstHalf.testMovements;

import day3.firstHalf.Movements.Movement;
import day3.firstHalf.Movements.MovementDown;
import day3.firstHalf.Position;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by paulograbin on 28/04/16.
 */
public class TestMovementDown extends TestCase {

    Movement m = new MovementDown();

    public void testOnUp() {
        Position p = new Position(0, 0);

        Position newPosition = m.move(p);

        assertEquals(newPosition.getX(), p.getX());
        assertEquals(newPosition.getY(), p.getY()-1);
    }

    public void testoi() {

    }
}
