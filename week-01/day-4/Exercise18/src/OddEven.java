import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){


        double number = 0;

        Scanner User = new Scanner(System.in);
        number = User.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

    }
}
