package com.bridgelabz.quantity;

public class Quantity {


    private final int value;
    private final Unit feet;

    public Quantity(int value, Unit feet) {

        this.value = value;
        this.feet = feet;
    }

    public boolean compare(Quantity quantity) {
        return this.value==quantity.value;
    }
}
