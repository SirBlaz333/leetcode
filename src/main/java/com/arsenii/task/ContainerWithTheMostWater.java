package com.arsenii.task;

public class ContainerWithTheMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int volume = calculateVolume(left, right, height);
        while (left <= right) {
            volume = Math.max(volume, calculateVolume(left, right, height));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return volume;
    }

    public int calculateVolume(int left, int right, int[] heights) {
        return (right - left) * Math.min(heights[left], heights[right]);
    }
}
