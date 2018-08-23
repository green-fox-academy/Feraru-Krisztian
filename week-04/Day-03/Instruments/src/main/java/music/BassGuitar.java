package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        setNumberOfStrings(4);
        setName("Bass Guitar");
    }

    public BassGuitar(int numberOfStrings) {
        setNumberOfStrings(numberOfStrings);
        setName("Bass Guitar");
    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }

    @Override
    public void play() {
        System.out.println(getName() + ", a " + getNumberOfStrings() + "-stringed instrument that goes " + this.sound());
    }
}
