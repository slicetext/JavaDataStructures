import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {
    @Test
    void isEmpty() {
        var s = new Stack<Integer>();
        Assertions.assertTrue(s.isEmpty());
        s.push(1);
        Assertions.assertFalse(s.isEmpty());
        s.pop();
        Assertions.assertTrue(s.isEmpty());
    }
    @Test
    void size() {
        var s = new Stack<Integer>();
        Assertions.assertEquals(0, s.size());
        s.push(1);
        Assertions.assertEquals(1, s.size());
        s.push(1);
        Assertions.assertEquals(2, s.size());
        s.pop();
        Assertions.assertEquals(1, s.size());
        s.pop();
        Assertions.assertEquals(0, s.size());
    }
    @Test
    void push_peek() {
        var s = new Stack<Integer>();
        s.push(2);
        Assertions.assertEquals(2, s.peek());
        s.push(4);
        Assertions.assertEquals(4, s.peek());
        s.push(6);
        Assertions.assertEquals(6, s.peek());
    }
    @Test
    void push_pop() {
        var s = new Stack<Integer>();
        s.push(3);
        s.push(6);
        Assertions.assertEquals(6, s.pop());
        Assertions.assertEquals(3, s.pop());
    }
}
