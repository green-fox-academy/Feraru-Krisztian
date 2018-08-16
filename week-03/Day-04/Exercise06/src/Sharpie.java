public class Sharpie {
    String color;
    float width;
    int inkAmount;

    Sharpie(String color, float width, int inkAmount) {

        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }

    void use() {

        inkAmount--;
    }

    @Override
    public String toString() {
        return "Color: " + this.color + ", with: " + this.width + ", ink: " + inkAmount + " |";
    }
}
