package com.bridgelabz.quantity;

public class Length {
    private final int value;
    private final Unit unit;

//    public static Length createFoot(int value) {
//        return new Length(value, Unit.feet);
//    }

    public Length(int value, Unit unit) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Length) {
            if (this.value == 0 && ((Length) obj).value == 0) {
                return true;
            }
            return this.value == ((Length) obj).value && this.unit == ((Length) obj).unit;
        }
        return false;

    }
}
