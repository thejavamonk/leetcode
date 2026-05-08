package com.codeprep;

/*
* Triplet Sum (Medium)
*
* Given an array of integers, return all triplets [a, b, c] such that a + b + c = 0 .
* The solution must not contain duplicate triplets (e.g., [1, 2, 3] and [2, 3, 1] are considered duplicates).
* If no such triplets are found, return an empty array.
*
* Each triplet can be arranged in any order, and the output can be returned in any order.

Example:
Input: nums = [0, -1, 2, -3, 1]
Output: [[-3, 1, 2], [-1, 0, 1]]
* */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TripletSum {

    static void main() {

        ArrayList<ArrayList<Integer>> soln = triplet_sum(new ArrayList<>(List.of(0, -1, 2, -3, 1)));
        System.out.println(soln);
    }

    public static ArrayList<ArrayList<Integer>> triplet_sum(ArrayList<Integer> nums) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        nums.sort(Integer::compareTo);
        for (int i = 0; i <= nums.size() - 1; i++) {
            List<Integer> temp = pair_sum_sorted(nums, -nums.get(i));
            if(!temp.isEmpty()){
                temp.add(i);
                ans.add(new ArrayList<>(temp));
            }
        }
        return ans;
    }

    public static ArrayList<Integer> pair_sum_sorted(ArrayList<Integer> nums, int target) {

        int left=0;
        int right=nums.size()-1;
        ArrayList<Integer> ans = new ArrayList<>();

        while (left < right){

            int sum = nums.get(left) + nums.get(right);

            if(sum == target){
                ans.add(nums.get(left));
                ans.add(nums.get(right));
                left++;
                do {
                    left++;
                } while (left < right && Objects.equals(nums.get(left), nums.get(left - 1)));
                return ans;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        return ans;
    }
}
