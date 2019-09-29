package com.bridgelabz.quantity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {

    @Nested
    static class FeetTest {
        @Test
        void givenZeroFeet_whenCheckEquals_thenShouldReturnEqual() {
            Length zero = new Length(0, Unit.feet);
            Length otherZero = new Length(0, Unit.feet);

            assertEquals(zero, otherZero);
        }

        @Test
        void givenZeroAndOneFeet_WhenCheckEquals_ThenShouldNotBeEqual() {
            Length zero = new Length(0, Unit.feet);
            Length one = new Length(1, Unit.feet);

            assertNotEquals(zero, one);
        }

        @Test
        void givenOneAndOneFeet_WhenCheckEquals_ThenShouldNotBeEqual() {
            Length one = new Length(1, Unit.feet);
            Length anotherOne = new Length(1, Unit.feet);

            assertEquals(one, anotherOne);
        }

        @Test
        void givenZeroAndNull_WhenCheckEquals_ThenShouldNotBeEqual() {
            Length zero = new Length(0, Unit.feet);

            assertNotEquals(null, zero);
        }
    }

    @Nested
    static class InchTest {
        @Test
        void givenZeroInch_whenCheckEquals_thenShouldBeEqual() {
            Length zero = new Length(0, Unit.inch);
            Length anotherZero = new Length(0, Unit.inch);

            assertEquals(zero, anotherZero);
        }

        @Test
        void givenZeroAndOneInch_whenCheckEquals_thenShouldNotBeEqual() {
            Length zero = new Length(0, Unit.inch);
            Length one = new Length(1, Unit.inch);

            assertNotEquals(zero, one);
        }

        @Test
        void givenOneAndOneFeet_WhenCheckEquals_ThenShouldNotBeEqual() {
            Length one = new Length(1, Unit.inch);
            Length anotherOne = new Length(1, Unit.inch);

            assertEquals(one, anotherOne);
        }

        @Test
        void givenZeroAndNull_whenCheckEquals_thenShouldNotBeEqual() {
            Length zero = new Length(0, Unit.inch);

            assertNotEquals(null, zero);
        }
    }

    @Test
    void givenOneFeetAndOneInch_WhenCheckEquals_thenShouldNotBeEqual() {
        Length oneFoot = new Length(1, Unit.feet);
        Length oneInch = new Length(1, Unit.inch);

        assertNotEquals(oneFoot, oneInch);
    }

    @Test
    void givenZeroFeetAndZeroInch_whenCheckEquals_thenShouldBeEqual() {
        Length zeroFeet = new Length(0, Unit.feet);
        Length zeroInch = new Length(0, Unit.inch);

        assertEquals(zeroFeet, zeroInch);
    }

    @Test
    void givenOneFootAndTwelveInch_whenCheckEquals_thenShouldBeEqual() {
        Length oneFoot = new Length(1, Unit.feet);
        Length twelveInch = new Length(12, Unit.inch);

        assertEquals(oneFoot, twelveInch);
    }

    @Test
    void givenTwoFeetAndTwelveInch_whenCheckEquals_thenShouldBeEqual() {
        Length twoFeet = new Length(2, Unit.feet);
        Length twelveInch = new Length(24, Unit.inch);

        assertEquals(twoFeet, twelveInch);
    }

    @Test
    void givenTwelveInchAndOneFoot_whenChecksEquals_thenShouldBeEqual() {
        Length oneFoot = new Length(1, Unit.feet);
        Length twelveInch = new Length(12, Unit.inch);

        assertEquals(twelveInch, oneFoot);
    }

    @Test
    void givenZeroYard_whenCheckEquals_thenTheyShouldBeEqual(){
        Length zeroYard = new Length(0, Unit.yard);
        Length anotherZeroYard = new Length(0, Unit.yard);

        assertTrue(zeroYard.equals(anotherZeroYard));
    }

    @Test
    void givenZeroAndOneYard_whenCheckEquals_thenTheyShouldNotBeEqual(){
        Length zeroYard = new Length(0, Unit.yard);
        Length oneYard = new Length(1, Unit.yard);

        assertFalse(zeroYard.equals(oneYard));
    }

    @Test
    void givenOneAndOneYard_whenCheckEquals_thenTheyShouldBeEqual(){
        Length oneYard = new Length(1, Unit.yard);
        Length anotherOneYard = new Length(1, Unit.yard);

        assertEquals(oneYard, anotherOneYard);
    }

    @Test
    void givenOneYardAndThirtySixInches_WhenCheckEquals_ThenTheyShouldBeEqual(){
        Length oneYard = new Length(1, Unit.yard);
        Length thirtySixInch = new Length(36, Unit.inch);
        assertEquals(thirtySixInch, oneYard);
    }

    @Test
    void givenOneYardAndThreeFeet_WhenCheckEquals_ThenTheyShouldBeEqual(){
        Length oneYard = new Length(1, Unit.yard);
        Length threeFeet = new Length(3, Unit.feet);
        assertEquals(threeFeet, oneYard);
    }

    @Test
    void givenZeroInchAndZeroInch_whenAdd_ThenShouldBeZeroInch(){
        Length zeroInch = new Length(0,Unit.inch);
        Length anotherZeroInch = new Length(0,Unit.inch);

        assertEquals(new Length(0, Unit.inch), zeroInch.add(anotherZeroInch));
    }

    @Test
    void givenOneInchAndOneInch_whenAdd_ThenShouldBeTwoInches(){
        Length oneInch = new Length(1,Unit.inch);
        Length anotherOneInch = new Length(1,Unit.inch);

        assertEquals(new Length(2, Unit.inch), oneInch.add(anotherOneInch));
    }

    @Test
    void givenZeroInchAndTwoInch_whenAdd_ThenShouldBeFourInches(){
        Length zeroInch = new Length(2,Unit.inch);
        Length oneInch = new Length(2,Unit.inch);

        assertEquals(new Length(4, Unit.inch), zeroInch.add(oneInch));
    }

    @Test
    void givenZeroInchAndZeroFeet_whenAdd_ThenShouldBeZeroInch(){
        Length zeroFeet = new Length(0,Unit.feet);
        Length zeroInch = new Length(0,Unit.inch);

        assertEquals(new Length(0, Unit.inch), zeroFeet.add(zeroInch));
    }

    @Test
    void givenZeroInchAndOneFeet_whenAdd_ThenShouldBeTwelveInches(){
        Length oneFeet = new Length(1,Unit.feet);
        Length zeroInch = new Length(0,Unit.inch);

        assertEquals(new Length(12, Unit.inch), oneFeet.add(zeroInch));
    }
}
