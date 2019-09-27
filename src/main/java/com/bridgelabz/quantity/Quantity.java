package com.bridgelabz.quantity;

public class Quantity {


    public final int value;
    public final Unit unit;

    public Quantity(int value, Unit feet) {

        this.value = value;
        this.unit = feet;
    }

//    public boolean compare(Quantity quantity) {
//        return this.value==quantity.value;
//    }


    @Override
    public boolean equals(Object obj) {
        obj=(Quantity)obj;
        return this.value==((Quantity) obj).value;
    }
}
