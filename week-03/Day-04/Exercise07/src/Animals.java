public class Animals {
    int hunger;
    int thirst;


    Animals() {
        hunger = 50;
        thirst = 50;
    }

    Animals(int hunger, int thirst) {
        this.hunger = hunger;
        this.thirst = thirst;
    }

    void eat() {
        hunger--;
    }

    void drink() {
        thirst--;
    }

    void play() {
        hunger++;
        thirst++;
    }
}
