public class Main {
    public static void main(String[] args) {

        Garden myGarden = new Garden();

        Flower yellowFlower = new Flower("yellow");
        Flower blueFlower = new Flower("blue");
        Tree purpleTree = new Tree("purple");
        Tree orangeTree = new Tree("orange");

        myGarden.addFlower(yellowFlower);
        myGarden.addFlower(blueFlower);
        myGarden.addTree(purpleTree);
        myGarden.addTree(orangeTree);

        myGarden.printGarden();
        myGarden.getPlants();
        myGarden.plantsStatus();
        System.out.println();
        myGarden.watering(40);
        myGarden.plantsStatus();
        System.out.println();
        myGarden.watering(70);
        myGarden.plantsStatus();

    }
}
