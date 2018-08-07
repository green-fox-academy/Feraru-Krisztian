import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class appendLetter {
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list

        appendA(far);
        System.out.println(far);
    }
    public static List<String> appendA(List<String> list) {

        for(int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + "a");

        }
        return list;
    }
}
