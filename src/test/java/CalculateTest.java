import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CalculateTest {
    private HashSet<Given> set1;
    private HashSet<Given> set2;


    @Before
    public void setUp()  {
        set1=new HashSet<>(Arrays.asList(Given.A,Given.B));
        set2=new HashSet<>(Arrays.asList(Given.B,Given.C));
    }

    @After
    public void tearDown()  {
        set1=null;
        set2=null;
    }

    @Test
    public void union() {
        HashSet<Given> expect=new HashSet<>(Arrays.asList(Given.A,Given.B,Given.C));
        Set<Given> actual=Calculate.union(set1,set2);
        assertEquals(actual,expect);
    }

    @Test
    public void intersection() {
        HashSet<Given> expect=new HashSet<>(List.of(Given.B));
        Set<Given> actual= Calculate.intersection(set1,set2);
        assertEquals(actual,expect);
    }

    @Test
    public void minus() {
        HashSet<Given> expect=new HashSet<>(List.of(Given.A));
        Set<Given> actual= Calculate.minus(set1,set2);
        assertEquals(actual,expect);
    }

    @Test
    public void difference() {
        HashSet<Given> expect=new HashSet<>(Arrays.asList(Given.A,Given.C));
        Set<Given> actual= Calculate.difference(set1,set2);
        assertEquals(actual,expect);
    }
}