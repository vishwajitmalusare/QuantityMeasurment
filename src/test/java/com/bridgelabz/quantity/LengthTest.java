package com.bridgelabz.quantity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {

    @Test
    void givenZeroFeet_whenCheckEquals_thenShouldReturnEqual() {
        Length zero = new Length(0, Unit.feet);
        Length otherZero = new Length(0, Unit.feet);

        assertTrue(zero.equals(otherZero));
    }

    @Test
    void givenZeroAndOneFeet_WhenCheckEquals_ThenShouldNotBeEqual(){
        Length zero = new Length(0, Unit.feet);
        Length one = new Length(1, Unit.feet);
        assertFalse(zero.equals(one));

    }

    @Test
    void givenZeroAndNull_WhenCheckEquals_ThenShouldNotBeEqual(){
        Length zero= new Length(0, Unit.feet);
        assertFalse(zero.equals(null));
    }

    @Test
    void givenZeroInch_whenCheckEquals_thenShouldBeEqual() {
        Length zero = new Length(0, Unit.inch);
        Length anotherZero = new Length(0, Unit.inch);

        assertTrue(zero.equals(anotherZero));
    }

    @Test
    void givenZeroAndOneInch_whenCheckEquals_thenShouldNotBeEqual() {
        Length zero = new Length(0, Unit.inch);
        Length one = new Length(1, Unit.inch);

        assertFalse(zero.equals(one));
    }

    @Test
    void givenZeroAndNull_whenCheckEquals_thenShouldNotBeEqual() {
        Length zero = new Length(0, Unit.inch);

        assertFalse(zero.equals(null));
    }

    @Test
    void givenOneFoottAndOneInch_WhenCheckEquals_thenShouldNotBeEqual(){
        Length oneFoot = new Length(1, Unit.feet);
        Length oneInch = new Length(1, Unit.inch);

        assertFalse(oneFoot.equals(oneInch));
    }

    @Test
    void givenZeroFeetAndZeroInch_whenCheckEquals_thenShouldBeEqual(){
        Length zeroFeet = new Length(0, Unit.feet);
        Length zeroInch = new Length(0, Unit.inch);

        assertTrue(zeroFeet.equals(zeroInch));
    }
}
