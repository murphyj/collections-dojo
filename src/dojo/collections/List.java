package dojo.collections;

public class List {
    private int length;
    private Element head;
    private Element tail;

    public int length() {
        return this.length;
    }

    public void add(Object o) {
        this.length++;
        Element element = new Element(o, this.length);
        this.tail = element;
        if (length == 1) {
            head = new Element(o, this.length++);
        }
    }

    public Object get(int index) {
        return head.object;
    }
}
