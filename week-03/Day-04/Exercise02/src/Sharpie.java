public class Sharpie {

    String color;
    float width;
    int inkAmount;

    Sharpie(String color, float width) {

        inkAmount = 100;
    }

    void use() {

        inkAmount--;
    }

}
