package com.bridgelabz.quantity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {

    @Nested
    static class FeetTest {
        @Test
        void givenZeroFeet_whenCheckEquals_thenShouldReturnEqual() {
            Quantity zero = new Quantity(0, new Feet());
            Quantity otherZero = new Quantity(0, new Feet());

            assertEquals(zero, otherZero);
        }

        @Test
        void givenZeroAndOneFeet_WhenCheckEquals_ThenShouldNotBeEqual() {
            Quantity zero = new Quantity(0, new Feet());
            Quantity one = new Quantity(1, new Feet());

            assertNotEquals(zero, one);
        }

        @Test
        void givenOneAndOneFeet_WhenCheckEquals_ThenShouldNotBeEqual() {
            Quantity one = new Quantity(1, new Feet());
            Quantity anotherOne = new Quantity(1, new Feet());

            assertEquals(one, anotherOne);
        }

        @Test
        void givenZeroAndNull_WhenCheckEquals_ThenShouldNotBeEqual() {
            Quantity zero = new Quantity(0, new Feet());

            assertNotEquals(null, zero);
        }
    }

    @Nested
    static class InchTest {
        @Test
        void givenZeroInch_whenCheckEquals_thenShouldBeEqual() {
            Quantity zero = new Quantity(0, new Inch());
            Quantity anotherZero = new Quantity(0, new Feet());

            assertEquals(zero, anotherZero);
        }

        @Test
        void givenZeroAndOneInch_whenCheckEquals_thenShouldNotBeEqual() {
            Quantity zero = new Quantity(0, new Inch());
            Quantity one = new Quantity(1, new Inch());

            assertNotEquals(zero, one);
        }

        @Test
        void givenOneAndOneFeet_WhenCheckEquals_ThenShouldNotBeEqual() {
            Quantity one = new Quantity(1, new Inch());
            Quantity anotherOne = new Quantity(1, new Inch());

            assertEquals(one, anotherOne);
        }

        @Test
        void givenZeroInchAndTwoInch_whenAdd_ThenShouldBeFourInches() {
            Quantity zeroInch = new Quantity(2, new Inch());
            Quantity oneInch = new Quantity(2, new Inch());

            assertEquals(new Quantity(4, new Inch()), zeroInch.add(oneInch));
        }

        @Test
        void givenZeroAndNull_whenCheckEquals_thenShouldNotBeEqual() {
            Quantity zero = new Quantity(0, new Inch());

            assertNotEquals(null, zero);
        }
    }

    @Nested
    public class FeetInchTest {
        @Test
        void givenOneFeetAndOneInch_WhenCheckEquals_thenShouldNotBeEqual() {
            Quantity oneFoot = new Quantity(1, new Feet());
            Quantity oneInch = new Quantity(1, new Inch());

            assertNotEquals(oneFoot, oneInch);
        }

        @Test
        void givenZeroFeetAndZeroInch_whenCheckEquals_thenShouldBeEqual() {
            Quantity zeroFeet = new Quantity(0, new Feet());
            Quantity zeroInch = new Quantity(0, new Inch());

            assertEquals(zeroFeet, zeroInch);
        }

        @Test
        void givenOneFootAndTwelveInch_whenCheckEquals_thenShouldBeEqual() {
            Quantity oneFoot = new Quantity(1, new Feet());
            Quantity twelveInch = new Quantity(12, new Inch());

            assertEquals(oneFoot, twelveInch);
        }

        @Test
        void givenTwoFeetAndTwelveInch_whenCheckEquals_thenShouldBeEqual() {
            Quantity twoFeet = new Quantity(2, new Feet());
            Quantity twelveInch = new Quantity(24, new Inch());

            assertEquals(twoFeet, twelveInch);
        }

        @Test
        void givenTwelveInchAndOneFoot_whenChecksEquals_thenShouldBeEqual() {
            Quantity oneFoot = new Quantity(1, new Feet());
            Quantity twelveInch = new Quantity(12, new Inch());

            assertEquals(twelveInch, oneFoot);
        }
    }

    @Nested
    public class YardTest {
        @Test
        void givenZeroYard_whenCheckEquals_thenTheyShouldBeEqual() {
            Quantity zeroYard = new Quantity(0, new Yard());
            Quantity anotherZeroYard = new Quantity(0, new Yard());

            assertTrue(zeroYard.equals(anotherZeroYard));
        }

        @Test
        void givenZeroAndOneYard_whenCheckEquals_thenTheyShouldNotBeEqual() {
            Quantity zeroYard = new Quantity(0, new Yard());
            Quantity oneYard = new Quantity(1, new Yard());

            assertFalse(zeroYard.equals(oneYard));
        }

        @Test
        void givenOneAndOneYard_whenCheckEquals_thenTheyShouldBeEqual() {
            Quantity oneYard = new Quantity(1, new Yard());
            Quantity anotherOneYard = new Quantity(1, new Yard());

            assertEquals(oneYard, anotherOneYard);
        }
    }

    @Nested
    public class YardFeetInchTest {
        @Test
        void givenOneYardAndThirtySixInches_WhenCheckEquals_ThenTheyShouldBeEqual() {
            Quantity oneYard = new Quantity(1, new Yard());
            Quantity thirtySixInch = new Quantity(36, new Inch());
            assertEquals(thirtySixInch, oneYard);
        }

        @Test
        void givenOneYardAndThreeFeet_WhenCheckEquals_ThenTheyShouldBeEqual() {
            Quantity oneYard = new Quantity(1, new Yard());
            Quantity threeFeet = new Quantity(3, new Feet());
            assertEquals(threeFeet, oneYard);
        }
        // TODO - yard and feet test
    }

    @Nested
    class LiterTest {

        @Test
        void givenZeroLiterAndZewroLiterWhenCheckEqualsThenTheyShouldEquals() {
            Quantity zeroLiter = new Quantity(0, new Liter());
            Quantity otherzeroLiter = new Quantity(0, new Liter());
            assertTrue(zeroLiter.equals(otherzeroLiter));
        }

        @Test
        void givenOneLiterAndOneLiterWhenAddThenShoiuldBeTwoLiters() throws IllegalArgumentException {
            Quantity oneLiter = new Quantity(1, new Liter());
            Quantity anotherOneLiter = new Quantity(1, new Liter());

            assertEquals(new Quantity(2, new Liter()), oneLiter.add(anotherOneLiter));
        }

        @Test
        void givenOneLiterAndTwoLiterWhenCheckEqualsThenShouldNotEqual() {
            Quantity oneLiter = new Quantity(1, new Liter());
            Quantity TwoLiter = new Quantity(2, new Liter());

            assertFalse(oneLiter.equals(TwoLiter));
        }

        @Test
        void givenOneLiterAndTwoLiterWhenAddThenShouldBeTwoLiters() throws IllegalArgumentException {
            Quantity oneLiter = new Quantity(1, new Liter());
            Quantity twoLiters = new Quantity(2, new Liter());

            assertEquals(new Quantity(3, new Liter()), oneLiter.add(twoLiters));
        }

    }

    @Nested
    class GallonTest {
        @Test
        void givenZeroGallonAndZeroGallon_WhenCheckEquals_ThenShouldBeEqual() {
            Quantity zeroGallon = new Quantity(0.0, new Gallon());
            Quantity otherZeroGallon = new Quantity(0.0, new Gallon());

            assertTrue(otherZeroGallon.equals(otherZeroGallon));
        }

        @Test
        void givenOneGallonAndOneGallon_WhenCheckEquals_ThenShouldBeEqual() {
            Quantity oneGallon = new Quantity(1.0, new Gallon());
            Quantity otherOneGallon = new Quantity(1.0, new Gallon());

            assertTrue(oneGallon.equals(otherOneGallon));
        }

        @Test
        void givenOneGallonAndTwoGallonWhenCheckEqualsThenShouldNotEquals() {
            Quantity oneGallon = new Quantity(1.0, new Gallon());
            Quantity twoGallon = new Quantity(2.0, new Gallon());

            assertFalse(oneGallon.equals(twoGallon));
        }

        @Test
        void givenOneGallonAndOneGallonWhenAddThenShouldBeTwoGallon() throws IllegalArgumentException {
            Quantity oneGallon = new Quantity(1, new Gallon());
            Quantity anotherOneGallon = new Quantity(1, new Gallon());

            assertEquals(new Quantity(2, new Gallon()), oneGallon.add(anotherOneGallon));
        }
    }

    @Nested
    class GallonAndLitersTest {
        @Test
        void givenZeroGallonAndZeroLiters_WhenCheckEquals_ThenShouldBeEqual() {
            Quantity zeroGallon = new Quantity(0.0, new Gallon());
            Quantity zeroLiter = new Quantity(0.0, new Liter());

            assertTrue(zeroGallon.equals(zeroLiter));
        }

        @Test
        void givenOneGallonAndZeroLiters_WhenCheckEquals_ThenShouldNotBeEqual() {
            Quantity oneGallon = new Quantity(1.0, new Gallon());
            Quantity zeroLiter = new Quantity(0.0, new Liter());

            assertFalse(oneGallon.equals(zeroLiter));
        }

        @Test
        void givenOneGallonAndThreePointSevenEightLiters_WhenCheckEquals_ThenShouldNotBeEqual() {
            Quantity oneGallon = new Quantity(1.0, new Gallon());
            Quantity threePointSevenEightLiter = new Quantity(3.78, new Liter());

            assertTrue(oneGallon.equals(threePointSevenEightLiter));
        }

        @Test
        void givenOneGallonAndOneLiterWhenAddThenShouldBeFourPointSevenEight() throws IllegalAccessError {
            Quantity oneGallon = new Quantity(1, new Gallon());
            Quantity oneLiter = new Quantity(1, new Liter());
            assertEquals(new Quantity(4.779999999999999, new Liter()), oneGallon.add(oneLiter));

        }
    }

    @Nested
    class VolumeAndLengthTest {
        @Test
        void givenZeroInchAndZeroLiterWhenCheckEqualsThenShoudNotEquals() {

            Quantity oneInch = new Quantity(0, new Inch());
            Quantity oneLiter = new Quantity(0, new Liter());

            assertFalse(oneInch.equals(oneLiter));
        }

        @Test
        void givenOneInchAndOneLiterWhenCheckEqualThenShoudNotEquals() {

            Quantity oneInch = new Quantity(1, new Inch());
            Quantity oneLiter = new Quantity(1, new Liter());

            assertFalse(oneInch.equals(oneLiter));
        }

        @Test
        void givenOneFeetAndOneLiterWhenCheckEqualThenShouldNotEqual() {
            Quantity oneFeet = new Quantity(1, new Feet());
            Quantity oneLiter = new Quantity(1, new Liter());

            assertFalse(oneFeet.equals(oneLiter));
        }

        @Test
        void givenOneInchtAndOneGallonWhenCheckEqualThenShouldNotEqual() {
            Quantity oneInch = new Quantity(1, new Inch());
            Quantity oneGallon = new Quantity(1, new Gallon());

            assertFalse(oneInch.equals(oneGallon));
        }

        @Test
        void givenOneFeetAndOneGallonWhenCheckEqualThenShouldNotEqual() {
            Quantity oneFeet = new Quantity(1, new Feet());
            Quantity oneGallon = new Quantity(1, new Gallon());

            assertFalse(oneFeet.equals(oneGallon));
        }

        @Test
        void givenOneYardAndOneLiterWhenCheckEqualThenShouldNotEqual() {
            Quantity oneYard = new Quantity(1, new Yard());
            Quantity oneLiter = new Quantity(1, new Liter());

            assertFalse(oneYard.equals(oneLiter));
        }

        @Test
        void givenOneYardAndOneGallonWhenCheckEqualThenShouldNotEqual() {
            Quantity oneYard = new Quantity(1, new Yard());
            Quantity oneGallon = new Quantity(1, new Gallon());

            assertFalse(oneYard.equals(oneGallon));
        }

        @Test
        void givenOneInchAndOneLiterWhenAddThenShouldNotAdded() {
            Inch inch = new Inch();
            Liter liter = new Liter();
            Quantity oneInch = new Quantity(1, inch);
            Quantity oneLiter = new Quantity(1, liter);

            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                oneInch.add(oneLiter);
            });
            assertEquals("Can't add " + inch + " And " + liter, exception.getMessage());
        }

        @Test
        void givenOneInchAndOneGallonWhenAddThenShouldNotAdded() {
            Inch inch = new Inch();
            Gallon gallon = new Gallon();
            Quantity oneInch = new Quantity(1, inch);
            Quantity oneGallon = new Quantity(1, gallon);

            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                oneInch.add(oneGallon);
            });
            assertEquals("Can't add " + inch + " And " + gallon, exception.getMessage());

        }

        @Test
        void givenFeetInchAndOneLiterWhenAddThenShouldNotAdd() {
            Feet feet = new Feet();
            Liter liter = new Liter();
            Quantity oneInch = new Quantity(1, feet);
            Quantity oneLiter = new Quantity(1, liter);

            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                oneInch.add(oneLiter);
            });
            assertEquals("Can't add " + feet + " And " + liter, exception.getMessage());
        }

        @Test
        void givenOneFeetAndOneGallonWhenAddThenShouldNotAdd() {
            Feet feet = new Feet();
            Gallon gallon = new Gallon();
            Quantity oneYard = new Quantity(1, feet);
            Quantity oneGallon = new Quantity(1, gallon);

            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                oneYard.add(oneGallon);
            });
            assertEquals("Can't add " + feet + " And " + gallon, exception.getMessage());

        }

        @Test
        void givenOneYardAndOneLiterWhenAddThenShouldNotAdd() {
            Yard yard = new Yard();
            Liter liter = new Liter();
            Quantity oneYard = new Quantity(1, yard);
            Quantity oneLiter = new Quantity(1, liter);

            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                oneYard.add(oneLiter);
            });
            assertEquals("Can't add " + yard + " And " + liter, exception.getMessage());

        }

        @Test
        void givenOneYardAndOneGallonWhenAddThenShouldNotAdd() {
            Yard yard = new Yard();
            Gallon gallon = new Gallon();
            Quantity oneYard = new Quantity(1, yard);
            Quantity oneGallon = new Quantity(1, gallon);

            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                oneYard.add(oneGallon);
            });
            assertEquals("Can't add " + yard + " And " + gallon, exception.getMessage());

        }

    }

}

