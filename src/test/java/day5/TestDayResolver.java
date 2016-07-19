package day5;

import junit.framework.Test;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Created by paulograbin on 19/07/16.
 */
public class TestDayResolver {

    public static void main(String[] args) {
        try {

            URL url = TestDayResolver.class.getClass().getResource("/day5/input.txt");
            try {
                File f = new File(url.toURI());
                FileReader fr = new FileReader(f);

                BufferedReader bf = new BufferedReader(fr);
                for(int i = 0; i < 5; i++)
                    System.out.println(bf.readLine());


            } catch (URISyntaxException e) {
                e.printStackTrace();
            }



        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
