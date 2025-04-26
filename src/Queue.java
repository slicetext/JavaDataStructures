import java.util.EmptyStackException;

public class Queue<T> {
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
            LinkedObject<T> item = data;
            T v = item.value;
            while(item != null) {
                v = item.value;
                item = item.next;
            }
            return v;
        }
        throw new EmptyStackException();
    }
    public T pop() {
        if(data != null) {
            LinkedObject<T> item = data;
            T v = item.value;
            while(item.next != null && item.next.next != null) {
                item = item.next;
            }
            if(item.next == null) {
                data = null;
                return v;
            }
            v = item.next.value;
            item.next = null;
            return v;
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

