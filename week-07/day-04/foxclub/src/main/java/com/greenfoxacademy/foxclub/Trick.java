package com.greenfoxacademy.foxclub;

public enum Trick {
    PROGRAMING("Write HTML"),
    DRIVING("Driving a car"),
    PLAYING("Play with the ball"),
    LEARNING("Coding in Java");

    private final String value;

    Trick(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
