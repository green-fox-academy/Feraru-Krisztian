import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    private Apple apple;

    @Before
    public void createApple() {
        apple = new Apple("apple");
    }

    @Test
    public void getApple() {
        assertEquals(apple.getApple(), "apple");
    }
}