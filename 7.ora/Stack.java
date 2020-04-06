import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Stack {
    private int size;
    private ArrayList<Integer> l = new ArrayList<>();

    public void push(int elem) {
        if (size == l.size()) {
            l.add(elem);
        } else {
            l.set(size, elem);
        }
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return l.get(--size);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}