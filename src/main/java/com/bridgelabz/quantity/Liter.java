package com.bridgelabz.quantity;

public class Liter implements UnitInterface {

    private double converter = 1;

    @Override
    public Quantity convertToBase(double value) {
        return new Quantity(value * converter, new Liter());
    }
    @Override
    public boolean equals(Object object) {
        return object instanceof Liter;
    }
}
