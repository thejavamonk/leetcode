package com.codeprep;

/*
* You are given an array of numbers, each representing the height of a vertical line on a graph.
* A container can be formed with any pair of these lines, along with the x-axis of the graph.
* Return the amount of water which the largest container can hold.
*
Example:
Input: heights = [2, 7, 8, 3, 7, 6]
Output: 24
* */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LargestContainer {

    static void main() {
        ArrayList<Integer> input = new ArrayList<>(List.of(2, 7, 8, 3, 7, 6));
        System.out.println(largest_container(input));
    }

    public static int largest_container(ArrayList<Integer> heights) {

        int left = 0, right = heights.size() - 1;
        int max = 0;

        while(left < right){

            int area = Math.min(heights.get(left), heights.get(right)) * (right - left);
            max = Math.max(max, area);

            if(heights.get(left) < heights.get(right)){
                left++;
            } else if (Objects.equals(heights.get(left), heights.get(right))) {
                left++;
                right--;
            } else{
                right--;
            }
        }
        return max;
    }
}
