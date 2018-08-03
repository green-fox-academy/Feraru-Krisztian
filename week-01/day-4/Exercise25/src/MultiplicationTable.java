import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        int number;

        Scanner user = new Scanner(System.in);
        System.out.println("Input a number: ");
        number = user.nextInt();


        for (int i = 0; i < 10; i++) {
            System.out.println(number + " x " + (i + 1) + " = " +
                    (number * (i + 1)));
        }
    }
}
