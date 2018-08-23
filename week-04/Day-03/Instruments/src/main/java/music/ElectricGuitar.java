package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        setNumberOfStrings(6);
        setName("Electric Guitar");
    }

    public ElectricGuitar(int numberOfStrings) {
        setNumberOfStrings(numberOfStrings);
        setName("Electric Guitar");
    }

    @Override
    public String sound() {
        return "Twang";
    }

    @Override
    public void play() {
        System.out.println(getName() + ", a " + getNumberOfStrings() + "-stringed instrument that goes " + this.sound());
    }
}
