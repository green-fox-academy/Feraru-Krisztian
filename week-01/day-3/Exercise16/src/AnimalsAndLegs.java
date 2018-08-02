import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        System.out.println("Enter number of chickens: ");
        Scanner chicken = new Scanner(System.in);
        int userInput1 = chicken.nextInt();

        System.out.println("Enter number of pigs: ");
        Scanner pig = new Scanner(System.in);
        int userInput2 = pig.nextInt();


        int legs = (userInput1 * 2) + (userInput2 * 4);
        System.out.println("The animals have "  + legs + " legs.");

    }
}
