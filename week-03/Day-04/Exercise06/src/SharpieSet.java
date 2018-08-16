import java.util.ArrayList;

public class SharpieSet {

     ArrayList<Sharpie> listOfSharpie = new ArrayList<>();

    public void setListOfSharpie(ArrayList<Sharpie> listOfSharpie) {
        this.listOfSharpie = listOfSharpie;
    }

    int countUsable() {

        int sum = 0;
        for (int i = 0; i < listOfSharpie.size(); i++) {
            if (listOfSharpie.get(i).inkAmount > 0){
                sum++;
            }
        }
        return sum;
    }

    void removeTrash() {

        for (int i = 0; i < listOfSharpie.size(); i++) {
            if (listOfSharpie.get(i).inkAmount <= 0) {
                listOfSharpie.remove(i);
            }

        }
    }
}
