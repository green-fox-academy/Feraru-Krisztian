import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

        myList.stream()
                .filter(x -> x * x > 20)
                .forEach(System.out::println);
    }
}
