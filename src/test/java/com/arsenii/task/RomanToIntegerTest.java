package com.arsenii.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {
    private RomanToInteger romanToInteger;

    @BeforeEach
    public void setUp() {
        romanToInteger = new RomanToInteger();
    }

    @Test
    public void testNumber3() {
        testNumber("III", 3);
    }

    @Test
    public void testNumber58() {
        testNumber("LVIII", 58);
    }

    @Test
    public void testNumber1994() {
        testNumber("MCMXCIV", 1994);
    }

    @Test
    public void testNumber621(){
        testNumber("DCXXI", 621);
    }

    public void testNumber(String input, int expected) {
        int actual = romanToInteger.romanToInt(input);
        assertEquals(expected, actual);
    }
}