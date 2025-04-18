import static org.junit.Assert.*;
import org.junit.Test;

public class PremierJUnitTestTest {
    
    @Test
    public void testConcatenate() {
        PremierJUnitTest test = new PremierJUnitTest();
        assertEquals("onetwo", test.concatenate("one", "two"));
    }
    
    @Test 
    public void testMultiply() {
        PremierJUnitTest test = new PremierJUnitTest();
        assertEquals(12, test.multiply(3, 4));
    }
}