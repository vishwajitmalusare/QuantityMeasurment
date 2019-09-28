package com.bridgelabz.quantity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {

    @Nested
    class FeetTest {
        @Test
        void givenZeroFeet_whenCheckEquals_thenShouldReturnEqual() {
            Length zero = new Length(0, Unit.feet);
            Length otherZero = new Length(0, Unit.feet);

            assertTrue(zero.equals(otherZero));
        }

        @Test
        void givenZeroAndOneFeet_WhenCheckEquals_ThenShouldNotBeEqual() {
            Length zero = new Length(0, Unit.feet);
            Length one = new Length(1, Unit.feet);
            assertFalse(zero.equals(one));

        }

        @Test
        void givenZeroAndNull_WhenCheckEquals_ThenShouldNotBeEqual() {
            Length zero = new Length(0, Unit.feet);
            assertFalse(zero.equals(null));
        }
    }

    @Nested
    class InchTest {
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
    }

    @Test
    void givenOneFeetAndOneInch_WhenCheckEquals_thenShouldNotBeEqual() {
        Length oneFoot = new Length(1, Unit.feet);
        Length oneInch = new Length(1, Unit.inch);

        assertFalse(oneFoot.equals(oneInch));
    }

    @Test
    void givenZeroFeetAndZeroInch_whenCheckEquals_thenShouldBeEqual() {
        Length zeroFeet = new Length(0, Unit.feet);
        Length zeroInch = new Length(0, Unit.inch);

        assertTrue(zeroFeet.equals(zeroInch));
    }

    @Test
    void givenOneFootAndTwelveInch_whenCheckEquals_thenShouldBeEqual() {
        Length oneFoot = new Length(1, Unit.feet);
        Length twelveInch = new Length(12, Unit.inch);

        assertTrue(oneFoot.equals(twelveInch));
    }

    @Test
    void givenTwelveInchAndOneFoot_whenChecksEquals_thenShouldBeEqual() {
        Length oneFoot = new Length(1, Unit.feet);
        Length twelveInch = new Length(12, Unit.inch);

        assertTrue(twelveInch.equals(oneFoot));
    }


}
