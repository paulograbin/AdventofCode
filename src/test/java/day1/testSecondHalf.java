package day1;

import commons.InputFileReader;
import day1.secondHalf.BasementFinder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;


public class testSecondHalf {

    BasementFinder finder;

    @Before
    public void setUp() throws IOException {
        InputFileReader inputReader = new InputFileReader(1);
        inputReader.loadInputFile();

        finder = new BasementFinder(inputReader.getFileContentAsString());

        System.out.println("Result is " + finder.getPositionInWhichSantaEntersInTheBasement());
    }

    @Test
    public void firstSampleInput1() {
        finder = new BasementFinder(")");

        int result = finder.getPositionInWhichSantaEntersInTheBasement();
        Assert.assertEquals(1, result);
    }

    @Test
    public void firstSampleInput2() {
        finder = new BasementFinder("()())");

        int result = finder.getPositionInWhichSantaEntersInTheBasement();
        Assert.assertEquals(5, result);
    }
}
