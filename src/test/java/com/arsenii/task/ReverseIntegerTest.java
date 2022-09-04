package com.arsenii.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    private ReverseInteger reverseInteger;

    @BeforeEach
    public void setUp() {
        reverseInteger = new ReverseInteger();
    }

    @Test
    public void testShortNumber() {
        int number = 123;
        int actual = reverseInteger.reverse(number);
        assertEquals(321, actual);
    }

    @Test
    public void testShortNegativeNumber() {
        int number = -123;
        int actual = reverseInteger.reverse(number);
        assertEquals(-321, actual);
    }

    @Test
    public void testNumberOutOfIntegerRange() {
        int number = 1999999999;
        int actual = reverseInteger.reverse(number);
        assertEquals(0, actual);
    }
}