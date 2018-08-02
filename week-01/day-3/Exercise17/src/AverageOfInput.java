import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        double sum = 0;

        System.out.println("Enter number of chickens: ");
        Scanner chicken = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            sum += chicken.nextInt();
        }
        double avg = sum / 5.0;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);

    }
}
