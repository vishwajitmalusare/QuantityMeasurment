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
        void givenZeroInchAndTwoInch_whenAdd_ThenShouldBeFourInches() throws IllegalAccessError {
            Quantity zeroInch = new Quantity(2, Unit.inch);
            Quantity oneInch = new Quantity(2, Unit.inch);

            assertEquals(new Quantity(4, Unit.inch), zeroInch.add(oneInch));
        }

        @Test
        void givenZeroAndNull_whenCheckEquals_thenShouldNotBeEqual() {
            Quantity zero = new Quantity(0, Unit.inch);

            assertNotEquals(null, zero);
        }
    }

    @Nested
    public class FeetInchTest {
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
    }

    @Nested
    public class YardTest {
        @Test
        void givenZeroYard_whenCheckEquals_thenTheyShouldBeEqual() {
            Quantity zeroYard = new Quantity(0, Unit.yard);
            Quantity anotherZeroYard = new Quantity(0, Unit.yard);

            assertTrue(zeroYard.equals(anotherZeroYard));
        }

        @Test
        void givenZeroAndOneYard_whenCheckEquals_thenTheyShouldNotBeEqual() {
            Quantity zeroYard = new Quantity(0, Unit.yard);
            Quantity oneYard = new Quantity(1, Unit.yard);

            assertFalse(zeroYard.equals(oneYard));
        }

        @Test
        void givenOneAndOneYard_whenCheckEquals_thenTheyShouldBeEqual() {
            Quantity oneYard = new Quantity(1, Unit.yard);
            Quantity anotherOneYard = new Quantity(1, Unit.yard);

            assertEquals(oneYard, anotherOneYard);
        }
    }

    @Nested
    public class YardFeetInchTest {
        @Test
        void givenOneYardAndThirtySixInches_WhenCheckEquals_ThenTheyShouldBeEqual() {
            Quantity oneYard = new Quantity(1, Unit.yard);
            Quantity thirtySixInch = new Quantity(36, Unit.inch);
            assertEquals(thirtySixInch, oneYard);
        }

        @Test
        void givenOneYardAndThreeFeet_WhenCheckEquals_ThenTheyShouldBeEqual() {
            Quantity oneYard = new Quantity(1, Unit.yard);
            Quantity threeFeet = new Quantity(3, Unit.feet);
            assertEquals(threeFeet, oneYard);
        }
    }

    @Nested
    class LiterTest {

        @Test
        void givenZeroLiterAndZewroLiterWhenCheckEqualsThenTheyShouldEquals() {
            Quantity zeroLiter = new Quantity(0, Unit.liters);
            Quantity otherzeroLiter = new Quantity(0, Unit.liters);
            assertTrue(zeroLiter.equals(otherzeroLiter));
        }

        @Test
        void givenOneLiterAndOneLiterWhenAddThenShoiuldBeTwoLiters() throws IllegalAccessError {
            Quantity oneLiter = new Quantity(1, Unit.liters);
            Quantity anotherOneLiter = new Quantity(1, Unit.liters);

            assertEquals(new Quantity(2, Unit.liters), oneLiter.add(anotherOneLiter));
        }

        @Test
        void givenOneLiterAndTwoLiterWhenCheckEqualsThenShouldNotEqual() {
            Quantity oneLiter = new Quantity(1, Unit.liters);
            Quantity TwoLiter = new Quantity(2, Unit.liters);

            assertFalse(oneLiter.equals(TwoLiter));
        }

        @Test
        void givenOneLiterAndTwoLiterWhenAddThenShouldBeTwoLiters() throws IllegalAccessError {
            Quantity oneLiter = new Quantity(1, Unit.liters);
            Quantity twoLiters = new Quantity(2, Unit.liters);

            assertEquals(new Quantity(3, Unit.liters), oneLiter.add(twoLiters));
        }

    }

    @Nested
    class GallonTest {
        @Test
        void givenZeroGallonAndZeroGallon_WhenCheckEquals_ThenShouldBeEqual() {
            Quantity zeroGallon = new Quantity(0.0, Unit.gallon);
            Quantity otherZeroGallon = new Quantity(0.0, Unit.gallon);

            assertTrue(otherZeroGallon.equals(otherZeroGallon));
        }

        @Test
        void givenOneGallonAndOneGallon_WhenCheckEquals_ThenShouldBeEqual() {
            Quantity oneGallon = new Quantity(1.0, Unit.gallon);
            Quantity otherOneGallon = new Quantity(1.0, Unit.gallon);

            assertTrue(oneGallon.equals(otherOneGallon));
        }

        @Test
        void givenOneGallonAndTwoGallonWhenCheckEqualsThenShouldNotEquals() {
            Quantity oneGallon = new Quantity(1.0, Unit.gallon);
            Quantity twoGallon = new Quantity(2.0, Unit.gallon);

            assertFalse(oneGallon.equals(twoGallon));
        }

        @Test
        void givenOneGallonAndOneGallonWhenAddThenShouldBeTwoGallon() throws IllegalAccessError {
            Quantity oneGallon = new Quantity(1, Unit.gallon);
            Quantity anotherOneGallon = new Quantity(1, Unit.gallon);

            assertEquals(new Quantity(2, Unit.gallon), oneGallon.add(anotherOneGallon));
        }
    }

    @Nested
    class GallonAndLitersTest {
        @Test
        void givenZeroGallonAndZeroLiters_WhenCheckEquals_ThenShouldBeEqual() {
            Quantity zeroGallon = new Quantity(0.0, Unit.gallon);
            Quantity zeroLiter = new Quantity(0.0, Unit.liters);

            assertTrue(zeroGallon.equals(zeroLiter));
        }

        @Test
        void givenOneGallonAndZeroLiters_WhenCheckEquals_ThenShouldNotBeEqual() {
            Quantity oneGallon = new Quantity(1.0, Unit.gallon);
            Quantity zeroLiter = new Quantity(0.0, Unit.liters);

            assertFalse(oneGallon.equals(zeroLiter));
        }

        @Test
        void givenOneGallonAndThreePointSevenEightLiters_WhenCheckEquals_ThenShouldNotBeEqual() {
            Quantity oneGallon = new Quantity(1.0, Unit.gallon);
            Quantity threePointSevenEightLiter = new Quantity(3.78, Unit.liters);

            assertTrue(oneGallon.equals(threePointSevenEightLiter));
        }

        @Test
        void givenOneGallonAndOneLiterWhenAddThenShouldBeFourPointSevenEight() throws IllegalAccessError {
            Quantity oneGallon = new Quantity(1, Unit.gallon);
            Quantity oneLiter = new Quantity(1, Unit.liters);
            assertEquals(new Quantity(4.779999999999999, Unit.liters), oneGallon.add(oneLiter));

        }
    }

    @Nested
    class VolumeAndLengthTest {
        @Test
        void givenZeroInchAndZeroLiterWhenCheckEqualsThenShoudNotEquals() {

            Quantity oneInch = new Quantity(0, Unit.inch);
            Quantity oneLiter = new Quantity(0, Unit.liters);

            assertFalse(oneInch.equals(oneLiter));
        }

        @Test
        void givenOneInchAndOneLiterWhenCheckEqualThenShoudNotEquals() {

            Quantity oneInch = new Quantity(1, Unit.inch);
            Quantity oneLiter = new Quantity(1, Unit.liters);

            assertFalse(oneInch.equals(oneLiter));
        }

        @Test
        void givenOneFeetAndOneLiterWhenCheckEqualThenShouldNotEqual() {
            Quantity oneFeet = new Quantity(1, Unit.feet);
            Quantity oneLiter = new Quantity(1, Unit.liters);

            assertFalse(oneFeet.equals(oneLiter));
        }

        @Test
        void givenOneInchtAndOneGallonWhenCheckEqualThenShouldNotEqual() {
            Quantity oneInch = new Quantity(1, Unit.inch);
            Quantity oneGallon = new Quantity(1, Unit.gallon);

            assertFalse(oneInch.equals(oneGallon));
        }

        @Test
        void givenOneFeetAndOneGallonWhenCheckEqualThenShouldNotEqual() {
            Quantity oneFeet = new Quantity(1, Unit.feet);
            Quantity oneGallon = new Quantity(1, Unit.gallon);

            assertFalse(oneFeet.equals(oneGallon));
        }

        @Test
        void givenOneYardAndOneLiterWhenCheckEqualThenShouldNotEqual() {
            Quantity oneYard = new Quantity(1, Unit.yard);
            Quantity oneLiter = new Quantity(1, Unit.liters);

            assertFalse(oneYard.equals(oneLiter));
        }

        @Test
        void givenOneYardAndOneGallonWhenCheckEqualThenShouldNotEqual() {
            Quantity oneYard = new Quantity(1, Unit.yard);
            Quantity oneGallon = new Quantity(1, Unit.gallon);

            assertFalse(oneYard.equals(oneGallon));
        }

        @Test
        void givenOneInchAndOneLiterWhenAddThenShouldNotAdded() {
            Quantity oneInch = new Quantity(1, Unit.inch);
            Quantity oneLiter = new Quantity(1, Unit.liters);

            assertThrows(IllegalAccessError.class,
            ()-> {
                oneInch.add(oneLiter);
            }
            );
        }

        @Test
        void givenOneInchAndOneGallonWhenAddThenShouldNotAdded() {
            Quantity oneInch = new Quantity(1, Unit.inch);
            Quantity oneGallon = new Quantity(1, Unit.gallon);

            assertThrows(IllegalAccessError.class,
                    ()-> {
                        oneInch.add(oneGallon);
                    }
            );
        }

        @Test
        void givenFeetInchAndOneLiterWhenAddThenShouldNotAdd() {
            Quantity oneInch = new Quantity(1, Unit.feet);
            Quantity oneLiter = new Quantity(1, Unit.liters);

            assertThrows(IllegalAccessError.class,
                    ()-> {
                        oneInch.add(oneLiter);
                    }
            );
        }

        @Test
        void givenOneYardAndOneLiterWhenAddThenShouldNotAdd() {
            Quantity oneYard = new Quantity(1,Unit.yard);
            Quantity oneLiter = new Quantity(1,Unit.liters);

            assertThrows(IllegalAccessError.class,
                    ()->{
                oneYard.add(oneLiter);
                    });
        }




    }

}

