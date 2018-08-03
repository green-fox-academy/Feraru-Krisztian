import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        int number;

        Scanner user = new Scanner(System.in);
        number = user.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print("x");
            }
            System.out.println("x");
        }


    }
}
