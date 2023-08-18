import java.util.NoSuchElementException;

public class MyArrayList<T> {
    private Object[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public MyArrayList() {
        array = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(T value) {
        if (size == array.length) {
            resizeArray(array.length * 2);
        }
        array[size++] = value;
    }

    public void remove(int index) {
        checkIndex(index);
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null;
    }

    public void clear() {
        array = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        checkIndex(index);
        return (T) array[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void resizeArray(int newCapacity) {
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}



