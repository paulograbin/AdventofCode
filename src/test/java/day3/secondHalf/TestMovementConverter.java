package day3.secondHalf;

import day3.secondHalf.Movements.Movement;
import day3.secondHalf.Movements.MovementConverter;
import day3.secondHalf.Movements.MovementDown;
import day3.secondHalf.Movements.MovementUp;
import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created by paulograbin on 01/05/16.
 */
public class TestMovementConverter extends TestCase {

    public void testEvenMovements() {
        String commandString = "^v^v^v^v^v";

        ArrayList<Movement> moves = MovementConverter.getOddMovementsFromString(commandString);

        assertEquals(5, moves.size());
        assertEquals(moves.get(0), new MovementUp());
        assertEquals(moves.get(1), new MovementUp());
        assertEquals(moves.get(2), new MovementUp());
        assertEquals(moves.get(3), new MovementUp());
        assertEquals(moves.get(4), new MovementUp());
    }

    public void testOddMovements() {
        String commandString = "^v^v^v^v^v";

        ArrayList<Movement> moves = MovementConverter.getEvenMovementsFromString(commandString);

        assertEquals(5, moves.size());
        assertEquals(moves.get(0), new MovementDown());
        assertEquals(moves.get(1), new MovementDown());
        assertEquals(moves.get(2), new MovementDown());
        assertEquals(moves.get(3), new MovementDown());
        assertEquals(moves.get(4), new MovementDown());
    }



}
