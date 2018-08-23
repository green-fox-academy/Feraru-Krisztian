package main.java.music;

public abstract class StringedInstrument extends Instrument {

    private int numberOfStrings;

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public abstract String sound();
}
