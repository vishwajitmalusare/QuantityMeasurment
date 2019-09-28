package com.bridgelabz.quantity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InchTest {

    @Test
    void givenZeroInch_whenCheckEquals_thenTheyShouldBeEqual() {
        Inch zero = new Inch(0);
        Inch anotherZero = new Inch(0);

        assertTrue(zero.equals(anotherZero));
    }

    @Test
    void givenZeroAndOneInch_whenCheckEquals_thenTheyShouldNotBeEqual() {
        Inch zero = new Inch(0);
        Inch one = new Inch(1);

        assertFalse(zero.equals(one));
    }


}
