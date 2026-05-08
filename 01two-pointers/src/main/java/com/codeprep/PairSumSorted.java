package com.codeprep;

/*
* Given an array of integers sorted in ascending order and a target value,
* return the indexes of any pair of numbers in the array that sum to the target.
* The order of the indexes in the result doesn't matter.
* If no pair is found, return an empty array.
*
Example 1:
Input: nums = [-5, -2, 3, 4, 6], target = 7
Output: [2, 3]
Explanation: nums[2] + nums[3] = 3 + 4 = 7

Example 2:
Input: nums = [1, 1, 1], target = 2
Output: [0, 1]
Explanation: other valid outputs could be [1, 0], [0, 2], [2, 0], [1, 2] or [2, 1].
* */

import java.util.ArrayList;
import java.util.List;

public class PairSumSorted {
    
    static void main() {
        List<Integer> nums = List.of(1,2,3,4,5);
        List<Integer> sol = pair_sum_sorted(new ArrayList<>(nums), 10);
        System.out.println(sol);
    }

    public static ArrayList<Integer> pair_sum_sorted(ArrayList<Integer> nums, int target) {

        int left=0;
        int right=nums.size()-1;
        ArrayList<Integer> ans = new ArrayList<>();

        while (left < right){

            int sum = nums.get(left) + nums.get(right);

            if (sum < target) {
                left++;
            }
            else if (sum > target) {
                right--;
            }
            else {
                ans.add(right);
                ans.add(left);
                return ans;
            }
        }
        return ans;
    }
}

/*Notes:
*
* Left pointer: will always point to a value less than or equal to the value on the right pointer
* because the array is sorted, incrementing it would yield in sum greater than the current sum.
*
* Right pointer: Decrementing the right pointer will result in a sum i.e. less than or equal to the
* current sum.
*
* Pseudocode:
*
* 1. If the sum is less than the target increment left -> aiming to increase the sum towards the target value
* 2. if the sum is greater than the target decrement right -> aiming to decrease the sum towards the target value
* */
