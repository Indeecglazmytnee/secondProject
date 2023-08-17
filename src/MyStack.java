import java.util.NoSuchElementException;

public class MyStack {
    private Node top;
    private int size;

    private class Node {
        Object value;
        Node next;

        Node(Object value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public MyStack() {
        top = null;
        size = 0;
    }

    public void push(Object value) {
        Node newNode = new Node(value, top);
        top = newNode;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            top = top.next;
        } else {
            Node prevNode = getNode(index - 1);
            Node currentNode = prevNode.next;
            prevNode.next = currentNode.next;
        }

        size--;
    }

    public void clear() {
        top = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return top.value;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Object value = top.value;
        top = top.next;
        size--;
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private Node getNode(int index) {
        Node currentNode = top;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }
}

