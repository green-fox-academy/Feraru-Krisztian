public class Animal {

    int hunger;
    int thirst;


    Animal() {
        hunger = 50;
        thirst = 50;
    }

    Animal(int hunger, int thirst) {
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
