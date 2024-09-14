import org.junit.Test;
import static org.junit.Assert.*;

public class Q1WeirdFunctionTest {

    @Test
    public void testRecursive() {
        assertEquals(0, Q1WeirdFunction.recursiveF(0));
        assertEquals(1, Q1WeirdFunction.recursiveF(1));
        assertEquals(2, Q1WeirdFunction.recursiveF(2));
        assertEquals(4, Q1WeirdFunction.recursiveF(3));
        assertEquals(11, Q1WeirdFunction.recursiveF(4));
    }

    @Test
    public void testIterative() {
        assertEquals(0, Q1WeirdFunction.iterativeF(0));
        assertEquals(1, Q1WeirdFunction.iterativeF(1));
        assertEquals(2, Q1WeirdFunction.iterativeF(2));
        assertEquals(4, Q1WeirdFunction.iterativeF(3));
        assertEquals(11, Q1WeirdFunction.iterativeF(4));
    }
}

