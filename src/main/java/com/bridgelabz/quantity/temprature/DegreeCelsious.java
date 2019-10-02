package com.bridgelabz.quantity.temprature;

import com.bridgelabz.quantity.Quantity;
import com.bridgelabz.quantity.temprature.NonAddableUnitInterface;

public class DegreeCelsious implements NonAddableUnitInterface {

    private  double converter = 1;

    @Override
    public  NonAddableQuantity convertToBase(double value) {

        return new NonAddableQuantity(value * converter,new Fahrenhiet());
    }


    public boolean equals(Object object) {
        return object instanceof DegreeCelsious;
    }
}

