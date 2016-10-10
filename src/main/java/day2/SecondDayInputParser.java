package day2;

import commons.InputFileReader;
import commons.StringQueue;

import java.io.IOException;


public class SecondDayInputParser {

    StringQueue queue;

    public SecondDayInputParser() throws IOException {
        InputFileReader fileReader = new InputFileReader(2);
        fileReader.loadInputFile();

        queue = fileReader.getFileContentAsList();
    }

    public void printResults() {
        int totalPaper = 0;
        int totalRibbon = 0;

        while(!queue.isEmpty()) {
            String expression = queue.removeFirst();
            String[] factors = expression.split("x");

            int firstFactor = Integer.valueOf(factors[0]);
            int secondFactor = Integer.valueOf(factors[1]);
            int thirdFactor = Integer.valueOf(factors[2]);

            WrappingPaperCalculator calculator = new WrappingPaperCalculator(firstFactor, secondFactor, thirdFactor);
            totalPaper = totalPaper + calculator.calculateAmountNeeded();

            RibbonCalculator ribbonCalculator = new RibbonCalculator(firstFactor, secondFactor, thirdFactor);
            totalRibbon = totalRibbon + ribbonCalculator.calculateAmountNeeded();
        }

        System.out.println("paper " + totalPaper);
        System.out.println("ribbon " + totalRibbon);
    }

    public static void main(String[] args) throws IOException {
        SecondDayInputParser p = new SecondDayInputParser();
        p.printResults();
    }
}
