 public class MyLinkedList {
        private Node head;
        private Node tail;
        private int size;

        private class Node {
            Object value;
            Node prev;
            Node next;

            Node(Object value, Node prev, Node next) {
                this.value = value;
                this.prev = prev;
                this.next = next;
            }
        }

        public MyLinkedList() {
            head = null;
            tail = null;
            size = 0;
        }

        public void add(Object value) {
            Node newNode = new Node(value, tail, null);
            if (tail != null) {
                tail.next = newNode;
            }
            tail = newNode;
            if (head == null) {
                head = newNode;
            }
            size++;
        }

        public void remove(int index) {
            Node node = getNode(index);
            Node prevNode = node.prev;
            Node nextNode = node.next;

            if (prevNode != null) {
                prevNode.next = nextNode;
            } else {
                head = nextNode;
            }

            if (nextNode != null) {
                nextNode.prev = prevNode;
            } else {
                tail = prevNode;
            }

            size--;
        }

        public void clear() {
            head = null;
            tail = null;
            size = 0;
        }

        public int size() {
            return size;
        }

        public Object get(int index) {
            Node node = getNode(index);
            return node.value;
        }

        private Node getNode(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }

            Node currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }

            return currentNode;
        }
    }


