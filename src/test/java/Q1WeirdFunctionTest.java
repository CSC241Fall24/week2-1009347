import org.junit.Test;
// import org.junit.runner.RunWith;
import static org.junit.Assert.*;

public class Q1WeirdFunctionTest {

    @Test
    public void testRecursive() {
        assertEquals(0, Q1WeirdFunction.fRecursive(0));
        assertEquals(1, Q1WeirdFunction.fRecursive(1));
        assertEquals(2, Q1WeirdFunction.fRecursive(2));
        assertEquals(4, Q1WeirdFunction.fRecursive(3));
        assertEquals(11, Q1WeirdFunction.fRecursive(4));
    }

    @Test
    public void testIterative() {
        assertEquals(0, Q1WeirdFunction.fIterative(0));
        assertEquals(1, Q1WeirdFunction.fIterative(1));
        assertEquals(2, Q1WeirdFunction.fIterative(2));
        assertEquals(4, Q1WeirdFunction.fIterative(3));
        assertEquals(11, Q1WeirdFunction.fIterative(4));
    }
}
