package com.bridgelabz.quantity;

import com.bridgelabz.quantity.length.Feet;
import com.bridgelabz.quantity.length.Inch;
import com.bridgelabz.quantity.length.Yard;
import com.bridgelabz.quantity.temprature.DegreeCelsious;
import com.bridgelabz.quantity.temprature.Fahrenhiet;
import com.bridgelabz.quantity.temprature.Quantity;
import com.bridgelabz.quantity.volume.Gallon;
import com.bridgelabz.quantity.volume.Liter;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {

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
            AddableQuantity zero = new AddableQuantity(0, new Feet());
            AddableQuantity one = new AddableQuantity(1, new Feet());

            assertNotEquals(zero, one);
        }

        @Test
        void givenOneAndOneFeet_WhenCheckEquals_ThenShouldNotBeEqual() {
            AddableQuantity one = new AddableQuantity(1, new Feet());
            AddableQuantity anotherOne = new AddableQuantity(1, new Feet());

            assertEquals(one, anotherOne);
        }

        @Test
        void givenZeroAndNull_WhenCheckEquals_ThenShouldNotBeEqual() {
            AddableQuantity zero = new AddableQuantity(0, new Feet());

            assertNotEquals(null, zero);
        }
    }

    @Nested
    static class InchTest {
        @Test
        void givenZeroInch_whenCheckEquals_thenShouldBeEqual() {
            AddableQuantity zero = new AddableQuantity(0, new Inch());
            AddableQuantity anotherZero = new AddableQuantity(0, new Feet());

            assertEquals(zero, anotherZero);
        }

        @Test
        void givenZeroAndOneInch_whenCheckEquals_thenShouldNotBeEqual() {
            AddableQuantity zero = new AddableQuantity(0, new Inch());
            AddableQuantity one = new AddableQuantity(1, new Inch());

            assertNotEquals(zero, one);
        }

        @Test
        void givenOneAndOneFeet_WhenCheckEquals_ThenShouldNotBeEqual() {
            AddableQuantity one = new AddableQuantity(1, new Inch());
            AddableQuantity anotherOne = new AddableQuantity(1, new Inch());

            assertEquals(one, anotherOne);
        }

        @Test
        void givenZeroInchAndTwoInch_whenAdd_ThenShouldBeFourInches() {
            AddableQuantity zeroInch = new AddableQuantity(2, new Inch());
            AddableQuantity oneInch = new AddableQuantity(2, new Inch());

            assertEquals(new AddableQuantity(4, new Inch()), zeroInch.add(oneInch));
        }

        @Test
        void givenZeroAndNull_whenCheckEquals_thenShouldNotBeEqual() {
            AddableQuantity zero = new AddableQuantity(0, new Inch());

            assertNotEquals(null, zero);
        }
    }

    @Nested
    public class FeetInchTest {
        @Test
        void givenOneFeetAndOneInch_WhenCheckEquals_thenShouldNotBeEqual() {
            AddableQuantity oneFoot = new AddableQuantity(1, new Feet());
            AddableQuantity oneInch = new AddableQuantity(1, new Inch());

            assertNotEquals(oneFoot, oneInch);
        }

        @Test
        void givenZeroFeetAndZeroInch_whenCheckEquals_thenShouldBeEqual() {
            AddableQuantity zeroFeet = new AddableQuantity(0, new Feet());
            AddableQuantity zeroInch = new AddableQuantity(0, new Inch());

            assertEquals(zeroFeet, zeroInch);
        }

        @Test
        void givenOneFootAndTwelveInch_whenCheckEquals_thenShouldBeEqual() {
            AddableQuantity oneFoot = new AddableQuantity(1, new Feet());
            AddableQuantity twelveInch = new AddableQuantity(12, new Inch());

            assertEquals(oneFoot, twelveInch);
        }

        @Test
        void givenTwoFeetAndTwelveInch_whenCheckEquals_thenShouldBeEqual() {
            AddableQuantity twoFeet = new AddableQuantity(2, new Feet());
            AddableQuantity twelveInch = new AddableQuantity(24, new Inch());

            assertEquals(twoFeet, twelveInch);
        }

        @Test
        void givenTwelveInchAndOneFoot_whenChecksEquals_thenShouldBeEqual() {
            AddableQuantity oneFoot = new AddableQuantity(1, new Feet());
            AddableQuantity twelveInch = new AddableQuantity(12, new Inch());

            assertEquals(twelveInch, oneFoot);
        }
    }

    @Nested
    public class YardTest {
        @Test
        void givenZeroYard_whenCheckEquals_thenTheyShouldBeEqual() {
            AddableQuantity zeroYard = new AddableQuantity(0, new Yard());
            AddableQuantity anotherZeroYard = new AddableQuantity(0, new Yard());

            assertTrue(zeroYard.equals(anotherZeroYard));
        }

        @Test
        void givenZeroAndOneYard_whenCheckEquals_thenTheyShouldNotBeEqual() {
            AddableQuantity zeroYard = new AddableQuantity(0, new Yard());
            AddableQuantity oneYard = new AddableQuantity(1, new Yard());

            assertFalse(zeroYard.equals(oneYard));
        }

        @Test
        void givenOneAndOneYard_whenCheckEquals_thenTheyShouldBeEqual() {
            AddableQuantity oneYard = new AddableQuantity(1, new Yard());
            AddableQuantity anotherOneYard = new AddableQuantity(1, new Yard());

            assertEquals(oneYard, anotherOneYard);
        }
    }

    @Nested
    class LiterTest {

        @Nested
        public class YardFeetInchTest {
            @Test
            void givenOneYardAndThirtySixInches_WhenCheckEquals_ThenTheyShouldBeEqual() {
                AddableQuantity oneYard = new AddableQuantity(1, new Yard());
                AddableQuantity thirtySixInch = new AddableQuantity(36, new Inch());
                assertEquals(thirtySixInch, oneYard);
            }

            @Test
            void givenOneYardAndThreeFeet_WhenCheckEquals_ThenTheyShouldBeEqual() {
                AddableQuantity oneYard = new AddableQuantity(1, new Yard());
                AddableQuantity threeFeet = new AddableQuantity(3, new Feet());
                assertEquals(threeFeet, oneYard);
            }
            // TODO - yard and feet test
        }

        @Test
        void givenZeroLiterAndZewroLiterWhenCheckEqualsThenTheyShouldEquals() {
            AddableQuantity zeroLiter = new AddableQuantity(0, new Liter());
            AddableQuantity otherzeroLiter = new AddableQuantity(0, new Liter());
            assertTrue(zeroLiter.equals(otherzeroLiter));
        }

        @Test
        void givenOneLiterAndOneLiterWhenAddThenShoiuldBeTwoLiters() throws IllegalArgumentException {
            AddableQuantity oneLiter = new AddableQuantity(1, new Liter());
            AddableQuantity anotherOneLiter = new AddableQuantity(1, new Liter());

            assertEquals(new AddableQuantity(2, new Liter()), oneLiter.add(anotherOneLiter));
        }

        @Test
        void givenOneLiterAndTwoLiterWhenCheckEqualsThenShouldNotEqual() {
            AddableQuantity oneLiter = new AddableQuantity(1, new Liter());
            AddableQuantity TwoLiter = new AddableQuantity(2, new Liter());

            assertFalse(oneLiter.equals(TwoLiter));
        }

        @Test
        void givenOneLiterAndTwoLiterWhenAddThenShouldBeTwoLiters() throws IllegalArgumentException {
            AddableQuantity oneLiter = new AddableQuantity(1, new Liter());
            AddableQuantity twoLiters = new AddableQuantity(2, new Liter());

            assertEquals(new AddableQuantity(3, new Liter()), oneLiter.add(twoLiters));
        }

    }

    @Nested
    class GallonTest {
        @Test
        void givenZeroGallonAndZeroGallon_WhenCheckEquals_ThenShouldBeEqual() {
            AddableQuantity zeroGallon = new AddableQuantity(0.0, new Gallon());
            AddableQuantity otherZeroGallon = new AddableQuantity(0.0, new Gallon());

            assertTrue(otherZeroGallon.equals(otherZeroGallon));
        }

        @Test
        void givenOneGallonAndOneGallon_WhenCheckEquals_ThenShouldBeEqual() {
            AddableQuantity oneGallon = new AddableQuantity(1.0, new Gallon());
            AddableQuantity otherOneGallon = new AddableQuantity(1.0, new Gallon());

            assertTrue(oneGallon.equals(otherOneGallon));
        }

        @Test
        void givenOneGallonAndTwoGallonWhenCheckEqualsThenShouldNotEquals() {
            AddableQuantity oneGallon = new AddableQuantity(1.0, new Gallon());
            AddableQuantity twoGallon = new AddableQuantity(2.0, new Gallon());

            assertFalse(oneGallon.equals(twoGallon));
        }

        @Test
        void givenOneGallonAndOneGallonWhenAddThenShouldBeTwoGallon() throws IllegalArgumentException {
            AddableQuantity oneGallon = new AddableQuantity(1, new Gallon());
            AddableQuantity anotherOneGallon = new AddableQuantity(1, new Gallon());

            assertEquals(new AddableQuantity(2, new Gallon()), oneGallon.add(anotherOneGallon));
        }
    }

    @Nested
    class GallonAndLitersTest {
        @Test
        void givenZeroGallonAndZeroLiters_WhenCheckEquals_ThenShouldBeEqual() {
            AddableQuantity zeroGallon = new AddableQuantity(0.0, new Gallon());
            AddableQuantity zeroLiter = new AddableQuantity(0.0, new Liter());

            assertTrue(zeroGallon.equals(zeroLiter));
        }

        @Test
        void givenOneGallonAndZeroLiters_WhenCheckEquals_ThenShouldNotBeEqual() {
            AddableQuantity oneGallon = new AddableQuantity(1.0, new Gallon());
            AddableQuantity zeroLiter = new AddableQuantity(0.0, new Liter());

            assertFalse(oneGallon.equals(zeroLiter));
        }

        @Test
        void givenOneGallonAndThreePointSevenEightLiters_WhenCheckEquals_ThenShouldNotBeEqual() {
            AddableQuantity oneGallon = new AddableQuantity(1.0, new Gallon());
            AddableQuantity threePointSevenEightLiter = new AddableQuantity(3.78, new Liter());

            assertTrue(oneGallon.equals(threePointSevenEightLiter));
        }

        @Test
        void givenOneGallonAndOneLiterWhenAddThenShouldBeFourPointSevenEight() throws IllegalAccessError {
            AddableQuantity oneGallon = new AddableQuantity(1, new Gallon());
            AddableQuantity oneLiter = new AddableQuantity(1, new Liter());
            assertEquals(new AddableQuantity(4.779999999999999, new Liter()), oneGallon.add(oneLiter));

        }
    }

    @Nested
    class VolumeAndLengthTest {
        @Test
        void givenZeroInchAndZeroLiterWhenCheckEqualsThenShoudNotEquals() {

            AddableQuantity oneInch = new AddableQuantity(0, new Inch());
            AddableQuantity oneLiter = new AddableQuantity(0, new Liter());

            assertFalse(oneInch.equals(oneLiter));
        }

        @Test
        void givenOneInchAndOneLiterWhenCheckEqualThenShoudNotEquals() {

            AddableQuantity oneInch = new AddableQuantity(1, new Inch());
            AddableQuantity oneLiter = new AddableQuantity(1, new Liter());

            assertFalse(oneInch.equals(oneLiter));
        }

        @Test
        void givenOneFeetAndOneLiterWhenCheckEqualThenShouldNotEqual() {
            AddableQuantity oneFeet = new AddableQuantity(1, new Feet());
            AddableQuantity oneLiter = new AddableQuantity(1, new Liter());

            assertFalse(oneFeet.equals(oneLiter));
        }

        @Test
        void givenOneInchtAndOneGallonWhenCheckEqualThenShouldNotEqual() {
            AddableQuantity oneInch = new AddableQuantity(1, new Inch());
            AddableQuantity oneGallon = new AddableQuantity(1, new Gallon());

            assertFalse(oneInch.equals(oneGallon));
        }

        @Test
        void givenOneFeetAndOneGallonWhenCheckEqualThenShouldNotEqual() {
            AddableQuantity oneFeet = new AddableQuantity(1, new Feet());
            AddableQuantity oneGallon = new AddableQuantity(1, new Gallon());

            assertFalse(oneFeet.equals(oneGallon));
        }

        @Test
        void givenOneYardAndOneLiterWhenCheckEqualThenShouldNotEqual() {
            AddableQuantity oneYard = new AddableQuantity(1, new Yard());
            AddableQuantity oneLiter = new AddableQuantity(1, new Liter());

            assertFalse(oneYard.equals(oneLiter));
        }

        @Test
        void givenOneYardAndOneGallonWhenCheckEqualThenShouldNotEqual() {
            AddableQuantity oneYard = new AddableQuantity(1, new Yard());
            AddableQuantity oneGallon = new AddableQuantity(1, new Gallon());

            assertFalse(oneYard.equals(oneGallon));
        }

        @Test
        void givenOneInchAndOneLiterWhenAddThenShouldNotAdded() {
            Inch inch = new Inch();
            Liter liter = new Liter();
            AddableQuantity oneInch = new AddableQuantity(1, inch);
            AddableQuantity oneLiter = new AddableQuantity(1, liter);

            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                oneInch.add(oneLiter);
            });
            assertEquals("Can't add " + inch + " And " + liter, exception.getMessage());
        }

        @Test
        void givenOneInchAndOneGallonWhenAddThenShouldNotAdded() {
            Inch inch = new Inch();
            Gallon gallon = new Gallon();
            AddableQuantity oneInch = new AddableQuantity(1, inch);
            AddableQuantity oneGallon = new AddableQuantity(1, gallon);

            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                oneInch.add(oneGallon);
            });
            assertEquals("Can't add " + inch + " And " + gallon, exception.getMessage());

        }

        @Test
        void givenFeetInchAndOneLiterWhenAddThenShouldNotAdd() {
            Feet feet = new Feet();
            Liter liter = new Liter();
            AddableQuantity oneInch = new AddableQuantity(1, feet);
            AddableQuantity oneLiter = new AddableQuantity(1, liter);

            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                oneInch.add(oneLiter);
            });
            assertEquals("Can't add " + feet + " And " + liter, exception.getMessage());
        }

        @Test
        void givenOneFeetAndOneGallonWhenAddThenShouldNotAdd() {
            Feet feet = new Feet();
            Gallon gallon = new Gallon();
            AddableQuantity oneYard = new AddableQuantity(1, feet);
            AddableQuantity oneGallon = new AddableQuantity(1, gallon);

            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                oneYard.add(oneGallon);
            });
            assertEquals("Can't add " + feet + " And " + gallon, exception.getMessage());

        }

        @Test
        void givenOneYardAndOneLiterWhenAddThenShouldNotAdd() {
            Yard yard = new Yard();
            Liter liter = new Liter();
            AddableQuantity oneYard = new AddableQuantity(1, yard);
            AddableQuantity oneLiter = new AddableQuantity(1, liter);

            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                oneYard.add(oneLiter);
            });
            assertEquals("Can't add " + yard + " And " + liter, exception.getMessage());

        }

        @Test
        void givenOneYardAndOneGallonWhenAddThenShouldNotAdd() {

            Yard yard = new Yard();
            Gallon gallon = new Gallon();
            AddableQuantity oneYard = new AddableQuantity(1, yard);
            AddableQuantity oneGallon = new AddableQuantity(1, gallon);

            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                oneYard.add(oneGallon);
            });
            assertEquals("Can't add " + yard + " And " + gallon, exception.getMessage());

        }

    }

    @Nested
    class DegreeCelsiousFarheniteTest {
        @Test
        void givenZeroDegreeCelsiousAndZeroDegreeCelciousWhenCheckEqualsThenTheyAreEqual() {
            Quantity oneDegreeCelsious = new Quantity(0, new DegreeCelsious());
            Quantity anotheroneDegreeCelsious = new Quantity(0, new DegreeCelsious());

            assertTrue(oneDegreeCelsious.equals(anotheroneDegreeCelsious));
        }

        @Test
        void givenOneDegreeCelsiousAndOneDegreeCelciousWhenCheckEqualsThenTheyAreEqual() {
            Quantity oneDegreeCelsious = new Quantity(1, new DegreeCelsious());
            Quantity anotheroneDegreeCelsious = new Quantity(1, new DegreeCelsious());

            assertTrue(oneDegreeCelsious.equals(anotheroneDegreeCelsious));
        }

        @Test
        void givenOneDegreeCelsiousAndThirtyTwoFahrenhietWhenCheckEqualsThenTheyAreEqual() {
            Quantity oneDegreeCelsious = new Quantity(0, new DegreeCelsious());
            Quantity oneFahrenhite = new Quantity(32, new Fahrenhiet());

            assertTrue(oneDegreeCelsious.equals(oneFahrenhite));
        }

    }

}

