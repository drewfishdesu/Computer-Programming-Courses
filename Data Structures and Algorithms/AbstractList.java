abstract class AbstractList<T> {
    public abstract void add(T element);
    public abstract T get(int index);
    public abstract int size();
}

public class MyList<T> extends AbstractList<T> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] elements;
    private int count;

    public MyList() {
        elements = new Object[INITIAL_CAPACITY];
        count = 0;
    }

    public void add(T element) {
        if (count == elements.length) {
            Object[] newElements = new Object[elements.length * 2]; // fixed variable name
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[count++] = element;
    }

    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);
        }
        return (T) elements[index];
    }

    public int size() {
        return count;
    }

    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Hello");
        list.add("World");
        list.add("!");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}