package day6.secondHalf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by paulograbin on 27/04/16.
 */
public class Grid {

    public Light[][] matrix;

    public Grid(int size) {
        matrix = new Light[size][size];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new Light();
            }
        }
    }

    public void executeOperation(Operation op, int xInitial, int xFinal, int yInitial, int yFinal) {
        for(int x = xInitial; x <= xFinal; x++) {
            for(int y = yInitial; y <= yFinal; y++) {
                op.execute(matrix[x][y]);
            }
        }
    }

    public int getBrightnessSum() {
        int brightnessCount = 0;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                brightnessCount = brightnessCount + matrix[i][j].getBrightness();
            }
        }

        return brightnessCount;
    }

    public int getSize() {
        return matrix.length * matrix.length;
    }



    public static void main(String[] args) {
        Grid grid = new Grid(1000);
        try {
            File file = new File("/Users/paulograbin/Desktop/inputDay6.txt");
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);

            int count = 0;

            String line = "";
            while ((line = bf.readLine()) != null) {
                String[] command = line.split(" ");

                Operation op = null;

                String firstCoordenate = "";
                String secondCoordenate = "";

                if(line.contains("turn off")) {
                    op = new TurnOffOperation();

                    firstCoordenate = command[2];
                    secondCoordenate = command[4];
                } else if(line.contains("turn on")) {
                    op = new TurnOnOperation();

                    firstCoordenate = command[2];
                    secondCoordenate = command[4];
                } else if(line.contains("toggle")) {
                    op = new ToggleOperation();

                    firstCoordenate = command[1];
                    secondCoordenate = command[3];
                }

                String[] pointA = firstCoordenate.split(",");
                String[] pointB = secondCoordenate.split(",");

                grid.executeOperation(op, Integer.valueOf(pointA[0]), Integer.valueOf(pointB[0]), Integer.valueOf(pointA[1]), Integer.valueOf(pointB[1]));
            }

            System.out.println("Total brightness " + grid.getBrightnessSum());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
