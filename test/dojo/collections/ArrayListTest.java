package dojo.collections;

import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayListTest {

    private ArrayList list;
    private Object first;

    @Before
    public void setup() {
        list = new ArrayList();
        first = new Object();
        list.add(first);
    }

    @Test
    public void addElementToList() throws Exception {
        assertThat(list.get(0), is(equalTo(first)));
        assertThat(list.length(), is(equalTo(1)));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getElementBeyondSizeOfListFailsWithOutOfBoundsException() throws Exception {
        list.get(1);
    }
}
