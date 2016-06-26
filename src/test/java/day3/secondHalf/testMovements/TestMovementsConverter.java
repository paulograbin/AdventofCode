package day3.secondHalf.testMovements;

import day3.secondHalf.Movements.*;
import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created by paulograbin on 29/04/16.
 */
public class TestMovementsConverter extends TestCase {

    public void testOne() {
        String commands = ">>>";

        ArrayList<Movement> moves = MovementConverter.getOddMovementsFromString(commands);

        assertEquals(moves.size(), commands.length());
        assertEquals(moves.get(0), new MovementRight());
        assertEquals(moves.get(1), new MovementRight());
        assertEquals(moves.get(2), new MovementRight());
    }

    public void testTwo() {
        String commands = "<";

        ArrayList<Movement> moves = MovementConverter.getOddMovementsFromString(commands);

        assertEquals(moves.size(), commands.length());
        assertEquals(moves.get(0), new MovementLeft());
    }

    public void testThree() {
        String commands = "<^>v";

        ArrayList<Movement> moves = MovementConverter.getOddMovementsFromString(commands);

        assertEquals(moves.size(), commands.length());
        assertEquals(moves.get(0), new MovementLeft());
        assertEquals(moves.get(1), new MovementUp());
        assertEquals(moves.get(2), new MovementRight());
        assertEquals(moves.get(3), new MovementDown());
    }
}