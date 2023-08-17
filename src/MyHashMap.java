public class MyHashMap {
    private static final int INITIAL_CAPACITY = 64;
    private Node[] table;
    private int size;

    private class Node {
        Object key;
        Object value;
        Node next;

        Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        table = new Node[INITIAL_CAPACITY];
        size = 0;
    }

    private int hash(Object key) {
        return Math.abs(key.hashCode()) % table.length;

    }

    public void put(Object key, Object value) {
        int index = hash(key);
        Node newNode = new Node(key, value);

        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node currentNode = table[index];
            while (currentNode.next != null) {
                if (currentNode.key.equals(key)) {
                    currentNode.value = value;
                    return;
                }
                currentNode = currentNode.next;
            }
            if (currentNode.key.equals(key)) {
                currentNode.value = value;
            } else {
                currentNode.next = newNode;
            }
        }

        size++;
    }

    public void remove(Object key) {
        int index = hash(key);

        if (table[index] == null) {
            return;
        }

        if (table[index].key.equals(key)) {
            table[index] = table[index].next;
            size--;
            return;
        }

        Node prevNode = table[index];
        Node currentNode = prevNode.next;
        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                prevNode.next = currentNode.next;
                size--;
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public void clear() {
        for (int i = 0; i < table.length; i++) {
            table[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(Object key) {
        int index = hash(key);

        Node currentNode = table[index];
        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }

        return null;
    }
}

