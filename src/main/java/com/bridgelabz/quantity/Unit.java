package com.bridgelabz.quantity;

public enum Unit {
    feet(12), inch(1), yard(36);

    private int converter;

    Unit(int converter) {
        this.converter = converter;
    }

    public int convertToBase(int value) {
        return value * converter;
    };
}
