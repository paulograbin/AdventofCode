package day5;

import day5.validations.StringValidation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by paulograbin on 14/07/16.
 */
public class TestNiceStringTester {

    NiceStringTester tester;

    @Before
    public void setUp() {
        tester = new NiceStringTester();
    }

    @Test
    public void performTestWithValidStringShouldReturnTrue() throws Exception {
        StringValidation mock = new MockAlwaysTrue();

        tester.addTest(mock, true);

        assertTrue(tester.performTests("aaa"));
    }

    @Test
    public void performTestsWithInvalidStringShouldReturnFalse() throws Exception {
        StringValidation mock = new MockAlwaysFalse();

        tester.addTest(mock, true);

        assertFalse(tester.performTests("xy"));
    }

    @Test
    public void testWithOneTestAdded() {
        StringValidation mock = new MockAlwaysTrue();

        tester.addTest(mock, true);

        assertTrue(tester.getTestCount() == 1);
    }
}
