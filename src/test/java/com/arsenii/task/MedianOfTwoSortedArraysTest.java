package com.arsenii.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {

    @Test
    public void testOddMergedArraySize(){
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        double actual = medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.0, actual);
    }

    @Test
    public void testEvenMergedArraySize(){
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        double actual = medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.5, actual);
    }

}