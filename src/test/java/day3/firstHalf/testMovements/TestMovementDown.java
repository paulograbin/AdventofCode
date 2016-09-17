package day3.firstHalf.testMovements;

import day3.firstHalf.Movements.Movement;
import day3.firstHalf.Movements.MovementDown;
import day3.firstHalf.Position;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by paulograbin on 28/04/16.
 */
public class TestMovementDown {

    Movement m = new MovementDown();

    @Test
    public void testOnUp() {
        Position p = new Position(0, 0);

        Position newPosition = m.move(p);

        assertEquals(newPosition.getX(), p.getX());
        assertEquals(newPosition.getY(), p.getY()-1);
    }
}
