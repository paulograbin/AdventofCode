package day3.secondHalf;

import day3.firstHalf.Movements.Movement;
import day3.firstHalf.Position;
import day3.firstHalf.Santa;
import day3.secondHalf.Movements.MovementConverter;

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
        houses = new HashMap<>();
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
        Santa regularSanta = new Santa();
        Santa roboSanta = new Santa();

        try {
            File file = new File("/Users/paulograbin/Desktop/inputDay3.txt");
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);

            String line = "";
            while((line = bf.readLine()) != null) {

                ArrayList<Movement> regularSantaMoves = MovementConverter.getOddMovementsFromString(line);
                ArrayList<Movement> roboSantaMoves = MovementConverter.getEvenMovementsFromString(line);

                ArrayList<Position> positions = regularSanta.executeMoveSequence(regularSantaMoves);
                ArrayList<Position> roboPositions = roboSanta.executeMoveSequence(roboSantaMoves);

                for(Position p : positions) {
                    if(w.containsPosition(p)) {
                        w.giveAnotherPresent(p);
                    } else {
                        w.giveFirstPresent(p);
                    }
                }

                for(Position p : roboPositions) {
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
