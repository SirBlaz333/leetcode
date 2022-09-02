package com.arsenii.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    public void simpleArrayTest() {
        int[] input = new int[]{2, 7, 11, 15};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(input, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void arrayWhenNumberCanBeRepeatedTest() {
        int[] input = new int[]{3, 2, 4};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(input, 6);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void arrayWhenNumberCanBeRepeatedNotFirstTest() {
        int[] input = new int[]{1, 3, 2, 4};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(input, 6);
        assertArrayEquals(new int[]{2, 3}, result);
    }
}