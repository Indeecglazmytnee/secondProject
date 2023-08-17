import java.util.NoSuchElementException;

public class MyStack<T> {
    private Node<T> top;
    private int size;

    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    public MyStack() {
        top = null;
        size = 0;
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value, top);
        top = newNode;
        size++;
    }

    public void remove(int index) {
        checkIndex(index);
        if (index == 0) {
            top = top.next;
        } else {
            Node<T> prevNode = getNode(index - 1);
            Node<T> currentNode = prevNode.next;
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

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return top.value;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T value = top.value;
        top = top.next;
        size--;
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private Node<T> getNode(int index) {
        Node<T> current = top;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}



