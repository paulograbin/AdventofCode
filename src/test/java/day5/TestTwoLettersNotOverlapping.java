package day5;

import day5.validations.StringValidation;
import day5.validations.TwoLettersTwiceNotOverlappingValidation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by paulograbin on 26/04/16.
 */
public class TestTwoLettersNotOverlapping {

    StringValidation tester;

    @Before
    public void setUp() throws Exception {
        tester = new TwoLettersTwiceNotOverlappingValidation();
    }

    @Test
    public void testOne() {
        assertTrue(tester.execute("xyxy"));
    }

    @Test
    public void testTwo() {
        assertTrue(tester.execute("aabcdefgaa"));
    }

    @Test
    public void testThree() {
        assertFalse(tester.execute("aaa"));
    }
}
