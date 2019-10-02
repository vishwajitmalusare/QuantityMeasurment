package com.bridgelabz.quantity.length;

import com.bridgelabz.quantity.Quantity;
import com.bridgelabz.quantity.UnitInterface;

public class Inch implements UnitInterface {

    private double converter = 1;

    @Override
    public Quantity convertToBase(double value) {
        return new Quantity(value * converter, new Inch());
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Inch;
    }
}