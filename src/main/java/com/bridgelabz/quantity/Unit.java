package com.bridgelabz.quantity;

public enum Unit {
    feet(12), inch(1), yard(36), gallon(3.78), liters(1);

    private double converter;

    Unit(double converter) {
        this.converter = converter;
    }

    public double convertToBase(double value) {
        return value * converter;
    };
}
