package day5.firstHalf;

import java.io.*;

/**
 * Created by I841059 on 25/04/2016.
 */
public class FileLoader {

    public static void main(String[] args) {
        try {
            File file = new File("/Users/paulograbin/Desktop/input.txt");
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);

            int count = 0;

            String line = "";
            while ((line = bf.readLine()) != null) {
                NiceString ns = new NiceString(line);
                if(ns.isNice()) {
                    count = count + 1;
                }
            }

            System.out.println("nice string count " + count);

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
