package day3.firstHalf;

/**
 * Created by paulograbin on 29/04/16.
 */
public class Position {

    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int hashCode() {
        return 31 * x + 31 * y;
    }

    @Override
    public boolean equals(Object obj) {
        final Position another = (Position) obj;

        return x == another.getX() && y == another.getY();

    }
}
