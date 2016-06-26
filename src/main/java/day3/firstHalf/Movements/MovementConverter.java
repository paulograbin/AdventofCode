package day3.firstHalf.Movements;

import java.util.ArrayList;

/**
 * Created by paulograbin on 29/04/16.
 */
public class MovementConverter {

    public static ArrayList<Movement> getMovementsFromString(String commandString) {
        ArrayList<Movement> movements = new ArrayList<Movement>();

        for(int i = 0; i < commandString.length(); i++) {
            char c = commandString.charAt(i);
            Movement m = null;

            if(c == '^')
                m = new MovementUp();
            else if (c == '>')
                m = new MovementRight();
            else if (c == 'v')
                m = new MovementDown();
            else if (c == '<')
                m = new MovementLeft();

            movements.add(m);
        }

        return movements;
    }
}
