package day3.firstHalf.Movements;

import day3.firstHalf.Position;

/**
 * Created by paulograbin on 28/04/16.
 */
public class MovementDown implements Movement {

    public Position move(Position p) {
        return new Position(p.getX(), p.getY()-1);
    }

    @Override
    public boolean equals(Object obj) {
        if(getClass() == obj.getClass())
            return true;

        return false;
    }
}
