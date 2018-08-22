public class Plants {
    private String color;
    private double waterAmount;

    public String getColor() {
        return this.color;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;

    }

    public double getWaterAmount() {
        return this.waterAmount;
    }

    public Plants(String color) {
        this.color = color;
        this.waterAmount = 0;
    }

    public boolean needsWater() {
        if (this.waterAmount < 0) {
            return true;
        }
        return false;
    }


}
