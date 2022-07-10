import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CalculateTest {

    private HashSet<Character> set1;
    private HashSet<Character> set2;


    @Before
    public void setUp() {
        set1 = new HashSet<>(Arrays.asList('A', 'B'));
        set2 = new HashSet<>(Arrays.asList('B', 'C'));
    }

    @After
    public void tearDown() {
        set1 = null;
        set2 = null;
    }

    @Test
    public void union() {
        HashSet<Character> expect = new HashSet<>(Arrays.asList('A', 'B', 'C'));
        Set<Character> actual = Calculate.union(set1, set2);
        assertEquals(expect, actual);
    }

    @Test
    public void intersection() {
        HashSet<Character> expect = new HashSet<>(List.of('B'));
        Set<Character> actual = Calculate.intersection(set1, set2);
        assertEquals(expect, actual);
    }

    @Test
    public void minus() {
        HashSet<Character> expect = new HashSet<>(List.of('A'));
        Set<Character> actual = Calculate.minus(set1, set2);
        assertEquals(expect, actual);
    }

    @Test
    public void difference() {
        HashSet<Character> expect = new HashSet<>(Arrays.asList('A', 'C'));
        Set<Character> actual = Calculate.difference(set1, set2);
        assertEquals(expect, actual);
    }
}