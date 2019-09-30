package com.bridgelabz.quantity;

public class Quantity {
    private double value;
    private Unit unit;


    public Quantity(double value, Unit unit) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object other) {

        if (this == other) {
            return true;
        }
        if (other instanceof Quantity) {
            Quantity length = (Quantity) other;
            return unit.convertToBase(this.value) == length.unit.convertToBase(length.value);
        }

        return false;
    }

    public Quantity add(Quantity other) {
        return new Quantity(unit.convertToBase(this.value) + other.unit.convertToBase(other.value), Unit.inch);
    }
}
