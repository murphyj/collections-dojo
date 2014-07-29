package dojo.collections;

public class ArrayList {

    private static final int DEFAULT_SIZE = 10;

    private Object[] elements;
    private int length;

    public ArrayList() {
        elements = new Object[DEFAULT_SIZE];
    }

    public Object get(int i) {
        return elements[i];
    }

    public int length() {
        return length;
    }

    public void add(Object element) {
        elements[length] = element;
        length++;
    }
}
