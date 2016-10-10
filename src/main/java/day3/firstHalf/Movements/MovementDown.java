package day3.firstHalf.Movements;

import day3.firstHalf.Position;


public class MovementDown implements Movement {

    public Position move(Position p) {
        return new Position(p.getX(), p.getY()-1);
    }

    @Override
    public boolean equals(Object obj) {
        return getClass() == obj.getClass();

    }
}
