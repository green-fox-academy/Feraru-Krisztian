import java.util.Arrays;

public class Anagram {

    private String string1;

    private String string2;

    public String getString1() {
        return string1;
    }

    public String getString2() {
        return string2;
    }

    public Anagram(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    public boolean checkIfIsAnagram() {
        char[] word1 = getString1().replaceAll("[\\s]", "").toCharArray();
        char[] word2 = getString2().replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }
}
