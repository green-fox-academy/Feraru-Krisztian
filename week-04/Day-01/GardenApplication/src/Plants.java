public class Plants {
    private String color;
    private int waterAmount;

    public String getColor() {
        return this.color;
    }

    public int getWaterAmount() {
        return this.waterAmount;
    }

    public Plants(String color) {
        this.color = color;
        this.waterAmount = 0;
    }

    public boolean needsWater() {
        if(this.waterAmount < 0) {
            return true;
        }
        return false;
    }
}
