package day3.secondHalf;

import day3.secondHalf.Movements.Movement;
import day3.secondHalf.Movements.MovementUp;
import day3.secondHalf.Position;
import day3.secondHalf.Santa;
import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created by paulograbin on 30/04/16.
 */
public class TestSanta extends TestCase {

    public void testOne() {
        ArrayList<Movement> moves = new ArrayList<Movement>();
        moves.add(new MovementUp());
        moves.add(new MovementUp());
        moves.add(new MovementUp());

        Santa s = new Santa();

        ArrayList<Position> positionsVisitedBySanta = s.executeMoveSequence(moves);

        assertEquals(positionsVisitedBySanta.size(), moves.size()+1);
    }
}
