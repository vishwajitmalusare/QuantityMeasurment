package com.bridgelabz.quantity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FeetTest {

    @Test
    void givenZeroFeet_whenCheckEquals_thenShouldReturnEqual() {
        Feet zero = new Feet(0);
        Feet otherZero = new Feet(0);

        assertTrue(zero.equals(otherZero));
    }

    @Test
    void givenZeroAndAnotherObject_WhenChechEquals_ThenShouldNotBeEqual(){
        Feet zero = new Feet(0);
        Feet one = new Feet(1);
        assertTrue(zero.equals(one));

    }
}
