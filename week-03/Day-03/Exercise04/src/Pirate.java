public class Pirate {

    int life = 100;
    int drunk = 0;

    int drinkSomeRun(){
        for (int i = 0; i <= life; i += 20) {
            life = life - i;
        }
        return life;
    }

    public void howsItGoingMate() {
        if (drinkSomeRun <= 4) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");

        }
    }

}
