package main.java.music;

public class Violin extends StringedInstrument {

    public Violin() {
        setNumberOfStrings(4);
        setName("Violin");
    }

    public Violin(int numberOfStrings) {
        setNumberOfStrings(numberOfStrings);
        setName("Violin");
    }

    @Override
    public String sound() {
        return "Screech";
    }

    @Override
    public void play() {
        System.out.println(getName() + ", a " + getNumberOfStrings() + "-stringed instrument that goes " + this.sound());
    }
}
