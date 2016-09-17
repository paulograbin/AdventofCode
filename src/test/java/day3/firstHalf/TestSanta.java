package day3.firstHalf;

import day3.firstHalf.Movements.Movement;
import day3.firstHalf.Movements.MovementUp;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by paulograbin on 30/04/16.
 */
public class TestSanta {

    @Test
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
