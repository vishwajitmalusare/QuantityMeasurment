package com.bridgelabz.quantity;

public class Length {
    private final int value;
    private final Unit unit;

    public Length(int value, Unit unit) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Length) {
            return this.value == ((Length) obj).value && this.unit==((Length) obj).unit;
        }
        return false;

    }
}
