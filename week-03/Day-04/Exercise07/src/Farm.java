import java.util.ArrayList;

public class Farm {

    ArrayList<Animals> listOfAnimals;

    Farm() {
        listOfAnimals = new ArrayList<>();
    }

    void addAnimalToList(Animals animal) {
        this.listOfAnimals.add(animal);
    }

    void breed() {
        if (listOfAnimals.size() <= 3) {
            Animals animal = new Animals();
            listOfAnimals.add(animal);
        }
    }

    void slaughter() {
        int min = 101;
        int j = 0;

        for (int i = 0; i < listOfAnimals.size(); i++) {
            if (listOfAnimals.get(i).hunger < min) {
                min = listOfAnimals.get(i).hunger;
                j = i;
            }
        }
        listOfAnimals.remove(j);
    }
}
