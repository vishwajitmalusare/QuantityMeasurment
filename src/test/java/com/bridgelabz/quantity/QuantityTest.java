package com.bridgelabz.quantity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Test
    void givenZeroFeetAndZeroInch_whenCompare_thenShouldReturnTrue() {

        Quantity zeroFeet = new Quantity(0, Unit.feet);

        assertTrue(zeroFeet.equals(zeroFeet));
    }

    @Test
    void givenOneFeet_whenCompare_thenShouldBeEqual(){
        Quantity oneFeet=new Quantity(1,Unit.feet);

        assertTrue(oneFeet.equals(oneFeet));
    }
}
