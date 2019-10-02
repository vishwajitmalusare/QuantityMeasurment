package com.bridgelabz.quantity.volume;

import com.bridgelabz.quantity.AddableQuantity;
import com.bridgelabz.quantity.UnitInterface;

public class Gallon implements UnitInterface {

    private double converter = 3.78;

    @Override
    public AddableQuantity convertToBase(double value) {
        return new AddableQuantity(value * converter, new Liter());
    }
    @Override
    public boolean equals(Object object) {
        return object instanceof Gallon;
    }
}
