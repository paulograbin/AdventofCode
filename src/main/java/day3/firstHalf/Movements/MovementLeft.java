package day3.firstHalf.Movements;

import day3.firstHalf.Position;

/**
 * Created by paulograbin on 28/04/16.
 */
public class MovementLeft implements Movement {

    public Position move(Position p) {
        return new Position(p.getX()-1, p.getY());
    }

    @Override
    public boolean equals(Object obj) {
        return getClass() == obj.getClass();

    }
}
