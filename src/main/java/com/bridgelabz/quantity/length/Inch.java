package com.bridgelabz.quantity.length;

import com.bridgelabz.quantity.AddableQuantity;
import com.bridgelabz.quantity.UnitInterface;

public class Inch implements UnitInterface {

    private double converter = 1;

    @Override
    public AddableQuantity convertToBase(double value) {
        return new AddableQuantity(value * converter, new Inch());
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Inch;
    }
}