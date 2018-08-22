import java.util.ArrayList;

public class Garden {

    private ArrayList<Plants> plants;

    public ArrayList<Plants> getPlants() {
        return plants;
    }

    public Garden() {
        this.plants = new ArrayList<Plants>();
    }

    public void addFlower(Flower flower) {
        plants.add(flower);
    }

    public void addTree(Tree tree) {
        plants.add(tree);
    }

    public void printGarden() {
        for (int i = 0; i < plants.size(); i++) {
            System.out.println(plants.get(i));
        }

    }

    public boolean isFlower(int index) {
        if (plants.get(index) instanceof Flower){
            return true;
        }
        return false;
    }

    public void plantsStatus() {
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).needsWater() && isFlower(i)) {
                System.out.println("The " + plants.get(i).getColor() + " flower needs water!");
            } else if(isFlower(i)){
                System.out.println("The " + plants.get(i).getColor() + " flower doesn't needs water!");
            }
        }
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).needsWater() && isFlower(i) != true) {
                System.out.println("The " + plants.get(i).getColor() + " tree needs water!");
            } else if(isFlower(i) != true) {
                System.out.println("The " + plants.get(i).getColor() + " tree doesn't needs water!");
            }
        }
    }

    public void watering(int amountOfWatering) {
        int waterPerPlant = 0;
        int counter = 0;
        for (Plants plant : plants) {
            if(plant.needsWater()) {
                counter++;
            }
        }
        waterPerPlant = amountOfWatering / counter;
        for (Plants plant : plants) {
            if(plant.needsWater()) {
                plant.setWaterAmount(waterPerPlant);
            }
        }
    }
}