package com.bridgelabz.quantity.length;

import com.bridgelabz.quantity.AddableQuantity;
import com.bridgelabz.quantity.UnitInterface;

public class Feet implements UnitInterface {

    private double converter = 12;

    @Override
    public AddableQuantity convertToBase(double value) {
        return new AddableQuantity(value * converter, new Inch());
    }
    @Override
    public boolean equals(Object object) {
        return object instanceof Feet;
    }
}
