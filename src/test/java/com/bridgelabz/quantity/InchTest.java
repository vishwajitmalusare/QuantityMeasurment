package com.bridgelabz.quantity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InchTest {

    @Test
    void givenZeroInch_whenCheckEquals_thenTheyShouldBeEqual(){
        Inch zero=new Inch(0);
        Inch anotherZero=new Inch(0);

        assertTrue(zero.equals(anotherZero));
    }
}
