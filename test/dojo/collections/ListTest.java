package dojo.collections;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ListTest {

    private List list;
    private Object first;

    @Before
    public void setup() {
        list = new List();
        first = new Object();
        list.add(first);
    }

    @Test
    public void addElementToList() throws Exception {
        assertThat(list.get(0), is(equalTo(first)));
        assertThat(list.length(), is(equalTo(1)));
    }

    @Test
    public void addTwoElements() throws Exception {
        Object second = new Object();
        list.add(second);
        assertThat(list.length(), is(equalTo(2)));
        assertThat(list.get(0), is(equalTo(first)));
        assertThat(list.get(1), is(equalTo(second)));
    }

    @Test
    public void insertElementAtX() throws Exception {
//        Object second = new O
//        assertThat(list.get(1), is(equalTo(second)));
    }
}
