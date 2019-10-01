package com.bridgelabz.quantity;

public class Gallon implements UnitInterface{

    private double converter = 3.78;

    @Override
    public Quantity convertToBase(double value) {
        return new Quantity(value * converter, new Liter());
    }
    @Override
    public boolean equals(Object object) {
        return object instanceof Gallon;
    }
}
