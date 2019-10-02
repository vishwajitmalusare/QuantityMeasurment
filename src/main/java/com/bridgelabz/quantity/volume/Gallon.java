package com.bridgelabz.quantity.volume;

import com.bridgelabz.quantity.Quantity;
import com.bridgelabz.quantity.UnitInterface;

public class Gallon implements UnitInterface {

    private double converter = 3.78;

    @Override
    public Quantity convertToBase(double value) {
        return new Quantity(value * converter, new Liter());
    }
    @Override
    public boolean equals(Object object) {
        return object instanceof Gallon;
    }
}
