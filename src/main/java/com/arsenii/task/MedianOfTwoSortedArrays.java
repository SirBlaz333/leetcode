package com.arsenii.task;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] array = new int[n + m];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                array[index++] = nums1[i++];
            } else {
                array[index++] = nums2[j++];
            }
        }
        while (i < n){
            array[index++] = nums1[i++];
        }
        while (j < m){
            array[index++] = nums2[j++];
        }
        index = Math.floorDiv(array.length, 2);
        if(array.length % 2 == 0){
            return ((double) array[index] + array[index - 1])/2;
        } else {
            return array[index];
        }
    }
}
