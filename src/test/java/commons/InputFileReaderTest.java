package commons;

import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;


public class InputFileReaderTest {

    InputFileReader fileReader;

    private int dayNumber = 4;

    @Before
    public void setUp() {
        fileReader = new InputFileReader(dayNumber);
        fileReader.loadInputFile();
    }

    @Test
    public void givenValidInput__inputFileMustExist() {
        File file = fileReader.getInputFile();
        assertTrue(file.exists());
    }

    @Test
    public void testGetInputOfADay() throws IOException {
        String fileContent = fileReader.getFileContentAsString();
        assertEquals("ckczppom", fileContent);
    }

    @Test(expected = NullPointerException.class)
    public void givenInvalidInput__mustThrowException() {
        fileReader = new InputFileReader(999);
        fileReader.loadInputFile();
    }
}
