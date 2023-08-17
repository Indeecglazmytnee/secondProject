import java.util.NoSuchElementException;

public class MyQueue {
    private Node front;
    private Node rear;
    private int size;

    private class Node {
        Object value;
        Node next;

        Node(Object value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void add(Object value) {
        Node newNode = new Node(value, null);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = newNode;
        }
        size++;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return front.value;
    }

    public Object poll() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Object value = front.value;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

