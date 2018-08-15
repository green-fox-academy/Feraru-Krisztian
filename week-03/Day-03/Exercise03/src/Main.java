import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Dominoes dominoe1 = new Dominoes(5, 6);
        Dominoes dominoe2 = new Dominoes(6, 7);
        Dominoes dominoe3 = new Dominoes(2, 3);
        Dominoes dominoe4 = new Dominoes(1, 2);
        Dominoes dominoe5 = new Dominoes(4, 5);
        Dominoes dominoe6 = new Dominoes(3, 5);

        ArrayList<Dominoes> dominoes = new ArrayList<>();
        dominoes.add(dominoe1);
        dominoes.add(dominoe2);
        dominoes.add(dominoe3);
        dominoes.add(dominoe4);
        dominoes.add(dominoe5);
        dominoes.add(dominoe6);

        ArrayList<List> list = new ArrayList<>();

        for (int i = 0; i < dominoes.size(); i++) {
            for (int j = 0; j < dominoes.size(); j++) {
                if (dominoes.get(i).values[1] == dominoes.get(j).values[0]) {
                    list.add(dominoes);
                }
            }
        }
        System.out.println(list);
    }
}
