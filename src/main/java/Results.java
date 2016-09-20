import day2.SecondDayInputParser;
import day4.Resolver;


public class Results {

    public Results() {
        try {
            System.out.println("Day 2");
            new SecondDayInputParser().printResults();

            System.out.println("Day 4");
            new Resolver().printResults();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Results();
    }
}
