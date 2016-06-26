package day3.firstHalf;

import day3.firstHalf.Movements.Movement;
import day3.firstHalf.Movements.MovementConverter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by paulograbin on 30/04/16.
 */
public class World {

    HashMap<Position, Integer> houses;

    public World() {
        houses = new HashMap<Position, Integer>();
    }

    public boolean containsPosition(Position p) {
        boolean value = false;

        value = houses.containsKey(p);

        return value;
    }

    public void giveFirstPresent(Position p) {
        houses.put(p, 1);
    }

    public void giveAnotherPresent(Position p) {
        int presentCount = houses.get(p);

        houses.put(p, presentCount+1);
    }

    public int getCountOfHouses() {
        return houses.size();
    }


    public static void main(String[] args) {
        World w = new World();
        Santa s = new Santa();

        try {
            File file = new File("/Users/paulograbin/Desktop/inputDay3.txt");
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);

            String line = "";
            while((line = bf.readLine()) != null) {

                ArrayList<Movement> moves = MovementConverter.getMovementsFromString(line);

                ArrayList<Position> positions = s.executeMoveSequence(moves);

                for(Position p : positions) {
                    if(w.containsPosition(p)) {
                        w.giveAnotherPresent(p);
                    } else {
                        w.giveFirstPresent(p);
                    }
                }

                System.out.println(w.getCountOfHouses());
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
