package com.arsenii.task;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hashedNums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashedNums.putIfAbsent(nums[i], i);
            Integer n = hashedNums.get(target - nums[i]);
            if(n != null && i > n){
                result[0] = n;
                result[1] = i;
                return result;
            }
        }
        return result;
    }
}
