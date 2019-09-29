package com.bridgelabz.quantity;

public class Length {
    private int value;
    private Unit unit;

/*
    public static Length createFoot(int value) {
        return new Length(value, Unit.feet);
    }
*/

    public Length() {
    }

    public Length(int value, Unit unit) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object other) {

        if (this == other) {
            return true;
        }
        if (other instanceof Length) {
            Length length = (Length) other;
            return unit.convertToBase(this.value) == length.unit.convertToBase(length.value);
        }

        return false;
    }

    public double add(Length anotherZeroInch) {
        return 0;
    }
}
