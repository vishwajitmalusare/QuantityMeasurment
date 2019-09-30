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
            Quantity baseOne =unit.convertToBase(this.value);
            Quantity baseTwo=length.unit.convertToBase(length.value);
            return  baseOne.value==baseTwo.value&&baseOne.unit==baseTwo.unit;
        }

        return false;
    }

    public Quantity add(Quantity other) {
        Quantity quantityOne= unit.convertToBase(value);
        Quantity quantityTwo= other.unit.convertToBase(other.value);
        return new Quantity(quantityOne.value + quantityTwo.value, quantityOne.unit.baseUnit());
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
