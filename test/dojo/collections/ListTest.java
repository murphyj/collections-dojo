package dojo.collections;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ListTest {

    private List list;
    private Object first;

    @Before
    public void setup() {
        list = new List();
        first = "1st";
        list.add(first);
    }

    @Test
    public void addElementToList() throws Exception {
        assertThat(list.get(0), is(equalTo(first)));
        assertThat(list.length(), is(equalTo(1)));
    }

    @Test
    public void firstElementIsBothHeadAndTail() throws Exception {
        assertThat(list.head(), is(equalTo(list.tail())));
    }

    @Test
    public void addSecondElementToList() throws Exception {
        Object second = "2nd";
        list.add(second);
        assertThat(list.get(1), is(equalTo(second)));
        assertThat(list.length(), is(equalTo(2)));
    }

    @Test
    public void elementAddedIsHead() throws Exception {
        Object second = "2nd";
        list.add(second);
        assertThat(list.head().object, is(equalTo(second)));
    }

    @Test
    public void firstElementAddedIsTail() throws Exception {
        list.add("1st");
        assertThat(list.tail().object, is(equalTo(first)));
    }

    @Test
    public void insertElementAtPosition() throws Exception {
        Object objectToInsert = "inserted";
        list.insert(objectToInsert, 1);
        assertThat(list.get(1), is(equalTo(objectToInsert)));
    }
}
