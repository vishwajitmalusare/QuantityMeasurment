package com.bridgelabz.quantity.temprature;

import com.bridgelabz.quantity.Quantity;
import com.bridgelabz.quantity.UnitInterface;

public class Fahrenhiet implements NonAddableUnitInterface {
    private double converter = 32;

    @Override
    public NonAddableQuantity convertToBase(double value) {
        return new NonAddableQuantity(value *(9/5) - converter,new Fahrenhiet());
    }

    public boolean equals(Object object) {
        return object instanceof Fahrenhiet;
    }

}
