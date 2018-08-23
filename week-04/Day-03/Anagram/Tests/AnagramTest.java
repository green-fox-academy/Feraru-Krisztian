import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void StringTest() {
        Anagram testerStrings = new Anagram("abc", "cba");
        assertTrue(testerStrings.checkIfIsAnagram());
    }

}