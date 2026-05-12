package com.codeprep;

import java.util.HashMap;

/**
 * Given an array of integers and a target, return the indices of the two numbers
 * that add up to the target. Uses a HashMap for O(n) time complexity.
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

