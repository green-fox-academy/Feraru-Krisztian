import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        double number1 = 0;
        double number2 = 0;

        Scanner User = new Scanner(System.in);
        number1 = User.nextInt();
        Scanner User2 = new Scanner(System.in);
        number2 = User2.nextInt();

        if (number1 > number2) {
            System.out.println( number1);

        } else {
            System.out.println(number2);
        }

    }
}
