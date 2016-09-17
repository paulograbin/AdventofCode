package day1;

import commons.InputFileReader;
import day1.firstHalf.FloorCounter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;


public class testFirstHalf {

    FloorCounter counter;

    @Before
    public void setUp() throws IOException {


        InputFileReader inputReader = new InputFileReader(1);
        inputReader.loadInputFile();

        counter = new FloorCounter(inputReader.getFileContentAsString());

        System.out.println("Result is " + counter.count());
    }

    @Test
    public void firstSampleInput1() {
        FloorCounter counter = new FloorCounter("(())");

        int result = counter.count();
        Assert.assertEquals(0, result);
    }

    @Test
    public void firstSampleInput2() {
        FloorCounter counter = new FloorCounter("()()");

        int result = counter.count();
        Assert.assertEquals(0, result);
    }

    @Test
    public void firstSampleInput3() {
        FloorCounter counter = new FloorCounter("(((");

        int result = counter.count();
        Assert.assertEquals(3, result);
    }

    @Test
    public void firstSampleInput4() {
        FloorCounter counter = new FloorCounter("(()(()(");

        int result = counter.count();
        Assert.assertEquals(3, result);
    }

    @Test
    public void firstSampleInput5() {
        FloorCounter counter = new FloorCounter("))(((((");

        int result = counter.count();
        Assert.assertEquals(3, result);
    }

    @Test
    public void firstSampleInput6() {
        FloorCounter counter = new FloorCounter("())");

        int result = counter.count();
        Assert.assertEquals(-1, result);
    }

    @Test
    public void firstSampleInput7() {
        FloorCounter counter = new FloorCounter("))(");

        int result = counter.count();
        Assert.assertEquals(-1, result);
    }

    @Test
    public void firstSampleInput8() {
        FloorCounter counter = new FloorCounter(")))");

        int result = counter.count();
        Assert.assertEquals(-3, result);
    }

    @Test
    public void firstSampleInput9() {
        FloorCounter counter = new FloorCounter(")())())");

        int result = counter.count();
        Assert.assertEquals(-3, result);
    }
}

