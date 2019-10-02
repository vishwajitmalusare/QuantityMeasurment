package com.bridgelabz.quantity.temprature;

import com.bridgelabz.quantity.AddableQuantity;
import com.bridgelabz.quantity.UnitInterface;

public class DegreeCelsious implements UnitInterface {

    private  double converter = 1;

    @Override
    public AddableQuantity convertToBase(double value) {

        return new AddableQuantity(value * converter, new Fahrenhiet());
    }


    public boolean equals(Object object) {
        return object instanceof DegreeCelsious;
    }
}

