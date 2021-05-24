package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnTrue()
    {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public  void testSecond()
    {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]hello[]"));
    }
    @Test
    public void testThird()
    {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]]code["));
    }
    @Test
    public void testFourth()
    {
        assertEquals(false,BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void testFifth()
    {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void testSixth()
    {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void testSeventh()
    {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Launch[Code]"));
    }
    @Test
    public void testEighth()
    {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }
    @Test
    public void testNinth()
    {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void testTenth()
    {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void testEleventh()
    {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }@Test
    public void testTwelfth()
    {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

}
