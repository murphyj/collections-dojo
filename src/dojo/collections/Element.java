package dojo.collections;

public class Element {
    public final Object object;

    private Element next;

    public Element(Object object) {
        this.object = object;
    }

    public void addNextElement(Element element) {
        this.next = element;
    }

    public Element nextElement() {
        return next;
    }
}
