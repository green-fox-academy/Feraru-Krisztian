public class Flower extends Plants {

    public Flower(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return getColor() + " flower.";
    }

    @Override
    public boolean needsWater() {
        if (getWaterAmount() < 5) {
            return true;
        }
        return false;
    }

    @Override
    public void setWaterAmount(double waterAmount) {
        super.setWaterAmount(waterAmount * 0.75);
    }
}
