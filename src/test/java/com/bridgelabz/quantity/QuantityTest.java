package com.bridgelabz.quantity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Test
    void givenZeroFeetAndZeroInch_whenCompare_thenShouldReturnTrue() {

        Quantity zeroFeet = new Quantity(0, Unit.feet);

        assertTrue(zeroFeet.compare(zeroFeet));
    }

    @Test
    void givenOneFeet_whenCompare_thenShouldBeEqual(){
        Quantity oneFeet=new Quantity(1,Unit.feet);

        assertTrue(oneFeet.compare(oneFeet));
    }

    @Test
    void givenOneAndTwoFeets_whenCompare_thenShouldBeNotEqual(){
        Quantity oneFeet=new Quantity(1,Unit.feet);
        Quantity twoFeet=new Quantity(2,Unit.feet);

        assertFalse(oneFeet.compare(twoFeet));
    }
}
