package com.bridgelabz.quantity;

public enum Unit {
    feet(12) {
        @Override
        public Unit baseUnit() {
            return Unit.inch;
        }
    },

    inch(1) {
        @Override
        public Unit baseUnit() {
            return Unit.inch;
        }
    },

    yard(36) {
        @Override
        public Unit baseUnit() {
            return Unit.inch;
        }
    },

    gallon(3.78) {
        @Override
        public Unit baseUnit() {
            return Unit.liters;
        }
    },

    liters(1) {
        @Override
        public Unit baseUnit() {
            return Unit.liters;
        }
    };

    public abstract Unit baseUnit();


    private double converter;

    Unit(double converter) {
        this.converter = converter;
    }

    public Quantity convertToBase(double value) {
        return new Quantity(value * converter, baseUnit());
    }
}
