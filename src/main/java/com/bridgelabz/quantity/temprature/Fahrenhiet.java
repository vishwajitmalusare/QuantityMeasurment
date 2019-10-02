package com.bridgelabz.quantity.temprature;

import com.bridgelabz.quantity.AddableQuantity;
import com.bridgelabz.quantity.UnitInterface;

public class Fahrenhiet implements UnitInterface {
    private double converter = 32;

    @Override
    public AddableQuantity convertToBase(double value) {
        return new AddableQuantity(value *(9/5) - converter, new Fahrenhiet());
    }

    public boolean equals(Object object) {
        return object instanceof Fahrenhiet;
    }

}
