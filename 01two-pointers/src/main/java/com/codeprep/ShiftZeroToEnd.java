package com.codeprep;

import java.util.ArrayList;
import java.util.List;

/*
* Shift Zeros to the End
*
* Given an array of integers, modify the array in place to move all zeros to the end while
* maintaining the relative order of non-zero elements.
*
Example:
Input: nums = [0, 1, 0, 3, 2]
Output: [1, 3, 2, 0, 0]
*
* */

public class ShiftZeroToEnd {

    static void main() {

        ArrayList<Integer> input = new ArrayList<>(List.of(0, 1, 0, 3, 2));
        shiftZerosToTheEnd(input);
    }

    public static void shiftZerosToTheEnd(ArrayList<Integer> nums) {

        int write = 0;
        for (int read = 0; read < nums.size(); read++) {
            if (nums.get(read) != 0) {
                nums.set(write, nums.get(read));  // place non-zero at write
                write++;
            }
        }

        while (write < nums.size()) {
            nums.set(write++, 0);
        }
    }
}
