import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

public class Stack<T> {
    LinkedObject<T> data;

    public void push(T value) {
        if(data == null) {
            data = new LinkedObject<>(value, null);
        } else {
            data = new LinkedObject<>(value, data);
        }
    }
    public T peek() {
        if(data != null) {
            return data.value;
        }
        throw new EmptyStackException();
    }
    public T pop() {
        if(data != null) {
            T old_val = data.value;
            data = data.next;
            return old_val;
        }
        throw new EmptyStackException();

    }
    public int size() {
        LinkedObject<T> i = data;
        int count = 0;
        while(i != null) {
            count++;
            i = i.next;
        }
        return count;
    }
    public boolean isEmpty() {
        return data == null;
    }
}
