package day4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class ResolverTest {

    Resolver resolver;

    @Before
    public void setUp() {
        resolver = new Resolver();
    }

    @Test
    public void testSampleInput1() {
        assertEquals(609043, resolver.getIntToFiveZeroes("abcdef"));
    }

    @Test
    public void testSampleInput2() {
        assertEquals(1048970, resolver.getIntToFiveZeroes("pqrstuv"));
    }
}
