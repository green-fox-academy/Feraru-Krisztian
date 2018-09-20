package com.greenfoxacademy.foxclub;

public enum Drink {
    COLA("cola"),
    BEER("beer"),
    LEMONADE("lemonade"),
    WATER("water");

    private final String value;

    Drink(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
