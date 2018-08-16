public class Main {
    public static void main(String[] args) {

      /*  Farm
        Reuse your Animal class
        Create a Farm class
        it has list of Animals
                        it has slots which defines the number of free places for animals
        breed() -> creates a new animal if there's place for it
        slaughter() -> removes the least hungry animal*/

        Farm theFarm = new Farm();

        Animals elephant = new Animals();

        Animals lion = new Animals(25, 45);

        theFarm.addAnimalToList(elephant);
        theFarm.addAnimalToList(lion);

        theFarm.breed();
        theFarm.breed();
        theFarm.breed();
        theFarm.breed();

        System.out.println(theFarm.listOfAnimals.size());

        theFarm.slaughter();

        System.out.println(theFarm.listOfAnimals.size());


    }
}
