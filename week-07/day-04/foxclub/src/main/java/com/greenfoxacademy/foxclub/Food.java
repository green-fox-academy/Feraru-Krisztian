package com.greenfoxacademy.foxclub;

public enum Food {
    GYROS("gyros"),
    PIZZA("pizza"),
    CHIPS("chips"),
    GOULASH("hungarian goulash");

    private final String value;

    Food(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
