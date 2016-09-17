package day3.secondHalf.Movements;

import day3.firstHalf.Movements.*;

import java.util.ArrayList;

/**
 * Created by paulograbin on 29/04/16.
 */
public class MovementConverter {

    public static ArrayList<Movement> getOddMovementsFromString(String commandString) {
        return parseMovementString(commandString, 0);
    }

    public static ArrayList<Movement> getEvenMovementsFromString(String commandString) {
        return parseMovementString(commandString, 1);
    }

    private static ArrayList<Movement> parseMovementString(String commandString, int initial) {
        ArrayList<Movement> movements = new ArrayList<Movement>();

        for(int i = initial; i < commandString.length(); i = i + 2) {
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
