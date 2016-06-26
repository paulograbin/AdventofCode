package day3.secondHalf.Movements;

import day3.secondHalf.Position;

/**
 * Created by paulograbin on 28/04/16.
 */
public class MovementRight implements Movement {

    public Position move(Position p) {
        return new Position(p.getX()+1, p.getY());
    }

    @Override
    public boolean equals(Object obj) {
        if(getClass() == obj.getClass())
            return true;

        return false;
    }
}
