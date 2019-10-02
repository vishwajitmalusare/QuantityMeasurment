package com.bridgelabz.quantity.temprature;

import com.bridgelabz.quantity.UnitInterface;

public class Quantity {
    protected double value;
    protected UnitInterface unit;

    public Quantity(double value, UnitInterface unit) { //constructor from super
        this.value = value;
        this.unit = unit;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Quantity) {
            Quantity quantity = (Quantity) other;
            Quantity baseOne = unit.convertToBase(this.value);
            Quantity baseTwo = quantity.unit.convertToBase(quantity.value);
            return baseOne.value == baseTwo.value && baseOne.unit.equals(baseTwo.unit);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
