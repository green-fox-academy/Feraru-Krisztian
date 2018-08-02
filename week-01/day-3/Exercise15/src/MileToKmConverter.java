import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

       System.out.println("Enter distance in kilometers: ");
       Scanner km = new Scanner(System.in);
       int userInput = km.nextInt();

       double mile = userInput * 0.62;
       System.out.println("The distance in miles is:"  + mile);

    }
}
