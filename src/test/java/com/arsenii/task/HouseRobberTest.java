package com.arsenii.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    @Test
    public void test1() {
        int[] numbers = new int[]{2, 1, 1, 2};
        HouseRobber houseRobber = new HouseRobber();
        assertEquals(4, houseRobber.rob(numbers));
    }

    @Test
    public void test2() {
        int[] numbers = new int[]{2, 7, 9, 3, 1};
        HouseRobber houseRobber = new HouseRobber();
        assertEquals(12, houseRobber.rob(numbers));
    }

}