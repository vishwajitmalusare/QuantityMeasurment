package com.bridgelabz.quantity;

import com.bridgelabz.quantity.temprature.Quantity;

public class AddableQuantity extends Quantity {

    public AddableQuantity(double value, UnitInterface unit) {
        super(value, unit);
    }


    public AddableQuantity add(AddableQuantity other) throws IllegalArgumentException {
        AddableQuantity quantityOne = unit.convertToBase(value);
        AddableQuantity quantityTwo = other.unit.convertToBase(other.value);

        if (!(quantityOne.unit.equals(quantityTwo.unit))) {
            throw new IllegalArgumentException("Can't add " + unit + " And " + other.unit);
        }
        return new AddableQuantity(quantityOne.value + quantityTwo.value, quantityTwo.unit);
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
