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
    void givenZeroInch_whenCheckEquals_thenTheyShouldBeEqual() {
        Length zero = new Length(0, Unit.inch);
        Length anotherZero = new Length(0, Unit.inch);

        assertTrue(zero.equals(anotherZero));
    }

    @Test
    void givenZeroAndOneInch_whenCheckEquals_thenTheyShouldNotBeEqual() {
        Length zero = new Length(0, Unit.inch);
        Length one = new Length(1, Unit.inch);

        assertFalse(zero.equals(one));
    }

    @Test
    void givenZeroAndNull_whenCheckEquals_thenTheyShouldNotBeEqual() {
        Length zero = new Length(0, Unit.inch);

        assertFalse(zero.equals(null));
    }

    @Test
    void givenOneFeetAndOneInch_WhenCheckEquals_thenShouldNotBeEquals(){
        Length oneFoot = new Length(1, Unit.feet);
        Length oneInch = new Length(1, Unit.inch);

        assertFalse(oneFoot.equals(oneInch));
    }
}
