package com.codeprep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
* Given an array of integers, return the indexes of any two numbers that add up to a target.
* The order of the indexes in the result doesn't matter. If no pair is found, return an empty array.

Example:
Input: nums = [-1, 3, 4, 2], target = 3
Output: [0, 2]
Explanation: nums[0] + nums[2] = -1 + 4 = 3

Constraints:
The same index cannot be used twice in the result.
* */
public class TwoSum {

    static void main() {

        ArrayList<Integer> input = new ArrayList<>(List.of(-1, 3, 4, 2));
        System.out.println(pair_sum_unsorted(input, 3));
    }

    public static ArrayList<Integer> pair_sum_unsorted(ArrayList<Integer> nums, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.size(); i++){
            int j = target - nums.get(i);
            if(hashMap.containsKey(j)){
                return new ArrayList<>(List.of(nums.indexOf(j), i));
            }else{
                hashMap.put(nums.get(i), 1);
            }
        }
        return new ArrayList<>();
    }
}

