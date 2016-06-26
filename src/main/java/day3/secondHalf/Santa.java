package day3.secondHalf;

import day3.secondHalf.Movements.Movement;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by paulograbin on 29/04/16.
 */
public class Santa {

    Position p;

    public Santa() {
        this.p = new Position(0, 0);
    }


    public ArrayList<Position> executeMoveSequence(ArrayList<Movement> moves) {
        ArrayList<Position> positionsVisitedBySanta = new ArrayList<Position>();

        positionsVisitedBySanta.add(p);

        Iterator<Movement> it = moves.iterator();

        while(it.hasNext()) {
            p = it.next().move(p);
            positionsVisitedBySanta.add(p);
        }

        return positionsVisitedBySanta;
    }
}
