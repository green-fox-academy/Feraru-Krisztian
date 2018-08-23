import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {


    @Test
    public void firstSumTest() {
        Sum myArrayList = new Sum();
        myArrayList.add(5);
        myArrayList.add(5);
        myArrayList.add(5);
        myArrayList.add(5);
        myArrayList.add(5);
        myArrayList.add(5);
        assertEquals(myArrayList.sum(myArrayList), 30);
    }

    @Test
    public void emptyListTest() {
        Sum myArrayList = new Sum();
        assertEquals(myArrayList.sum(myArrayList), 0);
    }

    @Test
    public void oneElementListTest() {
        Sum myArrayList = new Sum();
        myArrayList.add(5);
        assertEquals(myArrayList.sum(myArrayList), 5);
    }

    @Test(expected = NullPointerException.class)
    public void nullTest() {
        Sum myArrayList = null;
        assertEquals(myArrayList.sum(myArrayList), null);
    }
}