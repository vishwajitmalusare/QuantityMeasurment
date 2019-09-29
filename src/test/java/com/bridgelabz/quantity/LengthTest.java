package com.bridgelabz.quantity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {

    @Nested
    static class FeetTest {
        @Test
        void givenZeroFeet_whenCheckEquals_thenShouldReturnEqual() {
            Quantity zero = new Quantity(0, Unit.feet);
            Quantity otherZero = new Quantity(0, Unit.feet);

            assertEquals(zero, otherZero);
        }

        @Test
        void givenZeroAndOneFeet_WhenCheckEquals_ThenShouldNotBeEqual() {
            Quantity zero = new Quantity(0, Unit.feet);
            Quantity one = new Quantity(1, Unit.feet);

            assertNotEquals(zero, one);
        }

        @Test
        void givenOneAndOneFeet_WhenCheckEquals_ThenShouldNotBeEqual() {
            Quantity one = new Quantity(1, Unit.feet);
            Quantity anotherOne = new Quantity(1, Unit.feet);

            assertEquals(one, anotherOne);
        }

        @Test
        void givenZeroAndNull_WhenCheckEquals_ThenShouldNotBeEqual() {
            Quantity zero = new Quantity(0, Unit.feet);

            assertNotEquals(null, zero);
        }
    }

    @Nested
    static class InchTest {
        @Test
        void givenZeroInch_whenCheckEquals_thenShouldBeEqual() {
            Quantity zero = new Quantity(0, Unit.inch);
            Quantity anotherZero = new Quantity(0, Unit.inch);

            assertEquals(zero, anotherZero);
        }

        @Test
        void givenZeroAndOneInch_whenCheckEquals_thenShouldNotBeEqual() {
            Quantity zero = new Quantity(0, Unit.inch);
            Quantity one = new Quantity(1, Unit.inch);

            assertNotEquals(zero, one);
        }

        @Test
        void givenOneAndOneFeet_WhenCheckEquals_ThenShouldNotBeEqual() {
            Quantity one = new Quantity(1, Unit.inch);
            Quantity anotherOne = new Quantity(1, Unit.inch);

            assertEquals(one, anotherOne);
        }

        @Test
        void givenZeroAndNull_whenCheckEquals_thenShouldNotBeEqual() {
            Quantity zero = new Quantity(0, Unit.inch);

            assertNotEquals(null, zero);
        }
    }

    @Test
    void givenOneFeetAndOneInch_WhenCheckEquals_thenShouldNotBeEqual() {
        Quantity oneFoot = new Quantity(1, Unit.feet);
        Quantity oneInch = new Quantity(1, Unit.inch);

        assertNotEquals(oneFoot, oneInch);
    }

    @Test
    void givenZeroFeetAndZeroInch_whenCheckEquals_thenShouldBeEqual() {
        Quantity zeroFeet = new Quantity(0, Unit.feet);
        Quantity zeroInch = new Quantity(0, Unit.inch);

        assertEquals(zeroFeet, zeroInch);
    }

    @Test
    void givenOneFootAndTwelveInch_whenCheckEquals_thenShouldBeEqual() {
        Quantity oneFoot = new Quantity(1, Unit.feet);
        Quantity twelveInch = new Quantity(12, Unit.inch);

        assertEquals(oneFoot, twelveInch);
    }

    @Test
    void givenTwoFeetAndTwelveInch_whenCheckEquals_thenShouldBeEqual() {
        Quantity twoFeet = new Quantity(2, Unit.feet);
        Quantity twelveInch = new Quantity(24, Unit.inch);

        assertEquals(twoFeet, twelveInch);
    }

    @Test
    void givenTwelveInchAndOneFoot_whenChecksEquals_thenShouldBeEqual() {
        Quantity oneFoot = new Quantity(1, Unit.feet);
        Quantity twelveInch = new Quantity(12, Unit.inch);

        assertEquals(twelveInch, oneFoot);
    }

    @Test
    void givenZeroYard_whenCheckEquals_thenTheyShouldBeEqual(){
        Quantity zeroYard = new Quantity(0, Unit.yard);
        Quantity anotherZeroYard = new Quantity(0, Unit.yard);

        assertTrue(zeroYard.equals(anotherZeroYard));
    }

    @Test
    void givenZeroAndOneYard_whenCheckEquals_thenTheyShouldNotBeEqual(){
        Quantity zeroYard = new Quantity(0, Unit.yard);
        Quantity oneYard = new Quantity(1, Unit.yard);

        assertFalse(zeroYard.equals(oneYard));
    }

    @Test
    void givenOneAndOneYard_whenCheckEquals_thenTheyShouldBeEqual(){
        Quantity oneYard = new Quantity(1, Unit.yard);
        Quantity anotherOneYard = new Quantity(1, Unit.yard);

        assertEquals(oneYard, anotherOneYard);
    }

    @Test
    void givenOneYardAndThirtySixInches_WhenCheckEquals_ThenTheyShouldBeEqual(){
        Quantity oneYard = new Quantity(1, Unit.yard);
        Quantity thirtySixInch = new Quantity(36, Unit.inch);
        assertEquals(thirtySixInch, oneYard);
    }

    @Test
    void givenOneYardAndThreeFeet_WhenCheckEquals_ThenTheyShouldBeEqual(){
        Quantity oneYard = new Quantity(1, Unit.yard);
        Quantity threeFeet = new Quantity(3, Unit.feet);
        assertEquals(threeFeet, oneYard);
    }

    @Test
    void givenZeroInchAndZeroInch_whenAdd_ThenShouldBeZeroInch(){
        Quantity zeroInch = new Quantity(0,Unit.inch);
        Quantity anotherZeroInch = new Quantity(0,Unit.inch);

        assertEquals(new Quantity(0, Unit.inch), zeroInch.add(anotherZeroInch));
    }

    @Test
    void givenOneInchAndOneInch_whenAdd_ThenShouldBeTwoInches(){
        Quantity oneInch = new Quantity(1,Unit.inch);
        Quantity anotherOneInch = new Quantity(1,Unit.inch);

        assertEquals(new Quantity(2, Unit.inch), oneInch.add(anotherOneInch));
    }

    @Test
    void givenZeroInchAndTwoInch_whenAdd_ThenShouldBeFourInches(){
        Quantity zeroInch = new Quantity(2,Unit.inch);
        Quantity oneInch = new Quantity(2,Unit.inch);

        assertEquals(new Quantity(4, Unit.inch), zeroInch.add(oneInch));
    }

    @Test
    void givenZeroInchAndZeroFeet_whenAdd_ThenShouldBeZeroInch(){
        Quantity zeroFeet = new Quantity(0,Unit.feet);
        Quantity zeroInch = new Quantity(0,Unit.inch);

        assertEquals(new Quantity(0, Unit.inch), zeroFeet.add(zeroInch));
    }

    @Test
    void givenZeroInchAndOneFeet_whenAdd_ThenShouldBeTwelveInches(){
        Quantity oneFeet = new Quantity(1,Unit.feet);
        Quantity zeroInch = new Quantity(0,Unit.inch);

        assertEquals(new Quantity(12, Unit.inch), oneFeet.add(zeroInch));
    }

    @Test
    void givenTwoInchAndOneFeet_whenAdd_ThenShouldBeFourteenInches(){
        Quantity oneFeet = new Quantity(1,Unit.feet);
        Quantity twoInches = new Quantity(2,Unit.inch);

        assertEquals(new Quantity(14, Unit.inch), oneFeet.add(twoInches));
    }

    @Test
    void givenZeroGallonAndZeroLiters_WhenCheckEquals_ThenShouldBeEqual(){
        Quantity zeroGallon = new Quantity(0.0, Unit.gallon);
        Quantity zeroLiter = new Quantity(0.0, Unit.liters);

        assertTrue(zeroGallon.equals(zeroLiter));
    }

    @Test
    void givenOneGallonAndZeroLiters_WhenCheckEquals_ThenShouldNotBeEqual(){
        Quantity oneGallon = new Quantity(1.0, Unit.gallon);
        Quantity zeroLiter = new Quantity(0.0, Unit.liters);

        assertFalse(oneGallon.equals(zeroLiter));
    }

    @Test
    void givenOneGallonAndThreePointSevenEightLiters_WhenCheckEquals_ThenShouldNotBeEqual(){
        Quantity oneGallon = new Quantity(1.0, Unit.gallon);
        Quantity threePointSevenEightLiter = new Quantity(3.78, Unit.liters);

        assertTrue(oneGallon.equals(threePointSevenEightLiter));
    }

}

