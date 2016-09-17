package day3.firstHalf.testMovements;

import day3.firstHalf.Movements.*;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by paulograbin on 29/04/16.
 */
public class TestMovementsConverter {

    @Test
    public void testOne() {
        String commands = ">>>";

        ArrayList<Movement> moves = MovementConverter.getMovementsFromString(commands);

        assertEquals(moves.size(), commands.length());
        assertEquals(moves.get(0), new MovementRight());
        assertEquals(moves.get(1), new MovementRight());
        assertEquals(moves.get(2), new MovementRight());
    }

    @Test
    public void testTwo() {
        String commands = "<";

        ArrayList<Movement> moves = MovementConverter.getMovementsFromString(commands);

        assertEquals(moves.size(), commands.length());
        assertEquals(moves.get(0), new MovementLeft());
    }

    @Test
    public void testThree() {
        String commands = "<^>v";

        ArrayList<Movement> moves = MovementConverter.getMovementsFromString(commands);

        assertEquals(moves.size(), commands.length());
        assertEquals(moves.get(0), new MovementLeft());
        assertEquals(moves.get(1), new MovementUp());
        assertEquals(moves.get(2), new MovementRight());
        assertEquals(moves.get(3), new MovementDown());
    }
}
