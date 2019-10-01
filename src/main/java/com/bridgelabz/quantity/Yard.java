package com.bridgelabz.quantity;

public class Yard implements UnitInterface{

    private double converter = 36;

    @Override
    public Quantity convertToBase(double value) {
        return new Quantity(value * converter, new Inch());
    }
    @Override
    public boolean equals(Object object) {
        return object instanceof Yard;
    }
}
