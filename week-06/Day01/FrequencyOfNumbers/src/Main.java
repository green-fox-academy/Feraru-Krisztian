import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

        Map<Object, Long> num = numbers.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        Optional<Map.Entry<Object, Long>> max = num.entrySet()
                .stream()
                .max(Comparator.comparingLong(x -> x.getValue()));
        if (max.isPresent()) {
            System.out.println(max.get());
        }

        System.out.println(num);
    }
}
