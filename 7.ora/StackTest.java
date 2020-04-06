import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.NoSuchElementException;

public class StackTest {
    @Test
    public void testLIFO() {
        Stack s = new Stack();
        s.push(5);
        assertEquals(5, s.pop());
    }

    @Test
    public void testEmpty() {
        Stack s = new Stack();
        assertEquals(true, s.isEmpty());
    }

    @Test
    public void testNotEmpty() {
        Stack s = new Stack();
        s.push(0);
        assertEquals(false, s.isEmpty());
    }

    @Test(expected = NoSuchElementException.class)
    public void testThrows() {
        Stack s = new Stack();
        s.pop();
    }

    @Test
    public void testSize() {
        Stack s = new Stack();
        assertEquals(0, s.size());
        s.push(-3);
        assertEquals(1, s.size());
    }

    @Test
    public void testPush() {
        Stack s = new Stack();
        s.push(3);
        s.push(-2);
        assertEquals(-2, s.pop());
        s.push(7);
        assertEquals(7, s.pop());
        assertEquals(3, s.pop());
    }

    @Test
    public void testGetsEmpty() {
        Stack s = new Stack();
        s.push(-5);
        s.push(1);
        s.pop();
        s.pop();
        assertEquals(true, s.isEmpty());
    }
}