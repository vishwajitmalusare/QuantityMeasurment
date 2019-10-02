package com.bridgelabz.quantity.volume;

import com.bridgelabz.quantity.AddableQuantity;
import com.bridgelabz.quantity.UnitInterface;

public class Liter implements UnitInterface {

    private double converter = 1;

    @Override
    public AddableQuantity convertToBase(double value) {
        return new AddableQuantity(value * converter, new Liter());
    }
    @Override
    public boolean equals(Object object) {
        return object instanceof Liter;
    }
}
