package com.bridgelabz.quantity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    void givenZeroFeetAndZeroInch_whenCompare_thenShouldReturnTrue(){

        Quantity quantity=new Quantity(0,0);
        Assertions.assertEquals(true,quantity.compare());
    }
}
