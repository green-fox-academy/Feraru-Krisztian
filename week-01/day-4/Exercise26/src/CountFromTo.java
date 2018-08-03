import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        int number1;
        int number2;

        System.out.println("Enter two numbers: ");
        Scanner user1 = new Scanner(System.in);
        number1 = user1.nextInt();
        number2 = user1.nextInt();

        if (number1 > number2) {
            System.out.println("The second number should be bigger");
        } else if (number1 < number2) {
            for ( int i = number1; i < number2; i++) {
                System.out.println(i);
            }
        }

    }
}
