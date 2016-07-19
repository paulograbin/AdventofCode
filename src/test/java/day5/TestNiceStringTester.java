package day5;

import day5.validations.StringValidation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by paulograbin on 14/07/16.
 */
public class TestNiceStringTester {

    NiceStringTester tester;

    @Before
    public void setUp() {
        tester = new NiceStringTester();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithNoTestsAdded() {
        tester.performTests("aaa");
    }

    @Test
    public void performTestWithValidStringShouldReturnTrue() throws Exception {
        StringValidation mock = mock(StringValidation.class);
        when(mock.execute("aaa")).thenReturn(true);

        tester.addTest(mock, true);

        assertTrue(tester.performTests("aaa"));
    }

    @Test
    public void performTestsWithInvalidStringShouldReturnFalse() throws Exception {
        StringValidation mock = mock(StringValidation.class);
        when(mock.execute("aaa")).thenReturn(false);

        tester.addTest(mock, true);

        assertFalse(tester.performTests("xy"));
    }

    @Test
    public void testWithOneTestAdded() {
        StringValidation mock = mock(StringValidation.class);

        tester.addTest(mock, true);

        assertTrue(tester.getTestCount() == 1);
    }
}
