package com.bridgelabz.quantity.temprature;

public class NonAddableQuantity {
    private double value;
    private NonAddableUnitInterface unit;

    public NonAddableQuantity(double value, NonAddableUnitInterface unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof NonAddableQuantity) {
            NonAddableQuantity quantity = (NonAddableQuantity) other;
            NonAddableQuantity baseOne = unit.convertToBase(this.value);
            NonAddableQuantity baseTwo = quantity.unit.convertToBase(quantity.value);
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
