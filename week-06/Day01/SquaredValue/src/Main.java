import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

        myList.stream()
                .filter(x -> x > 0)
                .mapToInt(x -> x * x)
                .forEach(System.out::println);
    }
}
