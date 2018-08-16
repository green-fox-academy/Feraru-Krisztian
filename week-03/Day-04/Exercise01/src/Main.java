public class Main {
    public static void main(String[] args) {

        Animal elephant = new Animal();

        elephant.drink();
        System.out.println("Elephant thirst level is: " + elephant.thirst);

        elephant.play();
        System.out.println("Elephant thirst level is: " + elephant.thirst);
        System.out.println("Elephant hunger level is: " + elephant.hunger);

        elephant.eat();
        System.out.println("Elephant hunger level is: " + elephant.hunger);

        Animal lion = new Animal(25, 45);

        lion.eat();
        lion.eat();
        lion.eat();
        lion.eat();
        lion.eat();
        lion.eat();
        lion.eat();
        lion.eat();
        lion.eat();

        System.out.println("Lions hunger level is: " + lion.hunger);
    }
}
