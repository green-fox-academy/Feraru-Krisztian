import java.util.ArrayList;

public class Sum extends ArrayList<Integer> {

    ArrayList<Integer> arrayList;

    public Sum() {
        this.arrayList = new ArrayList<>();
    }

    public int sum(ArrayList<Integer> arrayList) {
        int sumOfElement = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sumOfElement += arrayList.get(i);
        }
        return sumOfElement;
    }


}
