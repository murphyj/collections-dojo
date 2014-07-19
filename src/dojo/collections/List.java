package dojo.collections;

public class List {
    private int length = 0;
    private Element head;
    private Element tail;

    public int length() {
        return this.length;
    }

    public void add(Object o) {
        Element element = new Element(o);
        Element oldHead = null;

        if (length > 0) {
            oldHead = head;
            oldHead.addNextElement(element);
        }

        head = element;
        length++;

        if (length == 1) {
            tail = head;
        }

    }

    public Object get(int index) {
        Element current = tail;
        for (int i = 0; i < index || i < length; i++) {
            if (index == i) {
                return current.object;
            } else {
                current = current.nextElement();
            }
        }
        return null;
    }

    public Element head() {
        return head;
    }

    public Element tail() {
        return tail;
    }

    public void insert(Object object, int i) throws IndexOutOfBoundsException {
        throwExceptionIfBeyondLength(i);

        Element nextElement = tail.nextElement();
        Element toInsert = new Element(object);
        tail.addNextElement(toInsert);
        toInsert.addNextElement(nextElement);
    }

    private void throwExceptionIfBeyondLength(int i) throws IndexOutOfBoundsException {
        if (i > length - 1) {
            throw new IndexOutOfBoundsException("Cannot insert at index " + i + ". Array is length " + length);
        }
    }
}
