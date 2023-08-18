/*public class Main {
    public static void main(String[] args) {
        // Примеры использования MyArrayList
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("Аrray List файл номер 1");
        myArrayList.add("Array List файл номер 2");
        System.out.println("MyArrayList size: " + myArrayList.size());
        System.out.println("MyArrayList element at index 1: " + myArrayList.get(0));
        System.out.println("MyArrayList element at index 1: " + myArrayList.get(1));

        // Примеры использования MyLinkedList
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("Linked List файл номер 1");
        myLinkedList.add("Linked List файл номер 2");
        System.out.println("MyLinkedList size: " + myLinkedList.size());
        System.out.println("MyLinkedList element at index 0: " + myLinkedList.get(0));
        System.out.println("MyLinkedList element at index 1: " + myLinkedList.get(1));

        // Примеры использования MyQueue
        MyQueue myQueue = new MyQueue();
        myQueue.add("Queue ну пусть тоже будет  1");
        myQueue.add("Queue а тут два  2");
        System.out.println("MyQueue size: " + myQueue.size());
        System.out.println("MyQueue peek: " + myQueue.peek());
        System.out.println("MyQueue poll: " + myQueue.poll());

        // Примеры использования MyStack
        MyStack myStack = new MyStack();
        myStack.push("ну в принципе так и должно быть цыфра 1 ");
        myStack.push("абра кадабра цифра 2 ");
        System.out.println("MyStack size: " + myStack.size());
        System.out.println("MyStack peek: " + myStack.peek());
        System.out.println("MyStack pop: " + myStack.pop());

        // Примеры использования MyHashMap
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put("Ключ 232", " очень интересно учить JAVA ");
        myHashMap.put(" ", " ну впринципе все ");
        System.out.println("MyHashMap size: " + myHashMap.size());
        System.out.println("MyHashMap value for Key 1: " + myHashMap.get("Ключ 232"));


     }
}*/
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        testMyArrayList();
        testMyLinkedList();
        testMyQueue();
        testMyStack();
        testMyHashMap();
    }

    private static void testMyArrayList() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            myArrayList.add("Element " + i);
        }
        System.out.println("MyArrayList size: " + myArrayList.size());
        System.out.println("MyArrayList element at index 0: " + myArrayList.get(0));
        System.out.println("MyArrayList element at index 999999: " + myArrayList.get(999999));
    }

    private static void testMyLinkedList() {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            myLinkedList.add("Node " + i);
        }
        System.out.println("MyLinkedList size: " + myLinkedList.size());
        System.out.println("MyLinkedList element at index 0: " + myLinkedList.get(0));
        System.out.println("MyLinkedList element at index 999999: " + myLinkedList.get(999999));
    }

    private static void testMyQueue() {
        MyQueue<String> myQueue = new MyQueue<>();
        for (int i = 0; i < 1000000; i++) {
            myQueue.add("Queue Element " + i);
        }
        System.out.println("MyQueue size: " + myQueue.size());
        System.out.println("MyQueue peek: " + myQueue.peek());
        System.out.println("MyQueue poll: " + myQueue.poll());
    }

    private static void testMyStack() {
        MyStack<String> myStack = new MyStack<>();
        for (int i = 0; i < 1000000; i++) {
            myStack.push("Stack Element " + i);
        }
        System.out.println("MyStack size: " + myStack.size());
        System.out.println("MyStack peek: " + myStack.peek());
        System.out.println("MyStack pop: " + myStack.pop());
    }

    private static void testMyHashMap() {
        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        for (int i = 0; i < 100000; i++) {
            myHashMap.put("Key " + i, "Value " + i);
        }
        System.out.println("MyHashMap size: " + myHashMap.size());
        System.out.println("MyHashMap value for Key 0: " + myHashMap.get("Key 0"));
        System.out.println("MyHashMap value for Key 99999: " + myHashMap.get("Key 99999"));
    }
}
