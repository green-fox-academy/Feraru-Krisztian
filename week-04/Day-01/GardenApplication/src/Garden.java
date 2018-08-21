import java.util.ArrayList;

public class Garden {

    private ArrayList<Flower> flowers;
    private ArrayList<Tree> trees;

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public ArrayList<Tree> getTrees() {
        return trees;
    }

    public Garden() {
        this.flowers = new ArrayList<Flower>();
        this.trees = new ArrayList<Tree>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void addTree(Tree tree) {
        trees.add(tree);
    }

    public void printGarden() {
        for (int i = 0; i < flowers.size(); i++) {
            System.out.println(flowers.get(i));
        }
        for (int i = 0; i < trees.size(); i++) {
            System.out.println(trees.get(i));
        }

    }

    public void plantsStatus() {
        for (int i = 0; i < flowers.size(); i++) {
            if (flowers.get(i).needsWater()) {
                System.out.println("The " + flowers.get(i).getColor() + " flower needs water!");
            } else {
                System.out.println("The " + flowers.get(i).getColor() + " flower doesn't needs water!");
            }
        }for (int i = 0; i < trees.size(); i++) {
            if (trees.get(i).needsWater()) {
                System.out.println("The " + trees.get(i).getColor() + " flower needs water!");
            } else {
                System.out.println("The " + trees.get(i).getColor() + " flower doesn't needs water!");
            }
        }
    }

    public void watering() {

    }
}