import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        int girls = 0;
        int boys = 0;

        Scanner user1 = new Scanner(System.in);
        girls = user1.nextInt();
        Scanner user2 = new Scanner(System.in);
        boys = user2.nextInt();

        if ((girls == boys) && (girls + boys >= 20)) {
            System.out.println("The party is exelent!");
        } else if ((girls != boys) && (girls + boys >= 20)) {
            System.out.println("quite cool party!");
        } else if ((girls + boys < 20) && (girls != 0)) {
            System.out.println("Average party...");
        } else if (girls == 0) {
            System.out.println("Sausage party");
        }
    }
}
