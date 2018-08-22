public class Tree extends Plants{

    public Tree(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return getColor() + " tree.";
    }

    @Override
    public boolean needsWater() {
        if(getWaterAmount() < 10) {
            return true;
        }
        return false;
    }

    @Override
    public void setWaterAmount(double waterAmount) {
        super.setWaterAmount(waterAmount * 0.4);
    }
}
