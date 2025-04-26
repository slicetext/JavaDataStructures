import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {
    @Test
    void isEmpty() {
        var s = new Stack<Integer>();
        Assertions.assertEquals(s.isEmpty(), true);
        s.push(1);
        Assertions.assertEquals(s.isEmpty(), false);
        s.pop();
        Assertions.assertEquals(s.isEmpty(), true);
    }
    @Test
    void size() {
        var s = new Stack<Integer>();
        Assertions.assertEquals(s.size(), 0);
        s.push(1);
        Assertions.assertEquals(s.size(), 1);
        s.push(1);
        Assertions.assertEquals(s.size(), 2);
        s.pop();
        Assertions.assertEquals(s.size(), 1);
        s.pop();
        Assertions.assertEquals(s.size(), 0);
    }
    @Test
    void push_peek() {
        var s = new Stack<Integer>();
        s.push(2);
        Assertions.assertEquals(s.peek(), 2);
        s.push(4);
        Assertions.assertEquals(s.peek(), 4);
        s.push(6);
        Assertions.assertEquals(s.peek(), 6);
    }
    @Test
    void push_pop() {
        var s = new Stack<Integer>();
        s.push(3);
        s.push(6);
        Assertions.assertEquals(s.pop(), 6);
        Assertions.assertEquals(s.pop(), 3);
    }
}
