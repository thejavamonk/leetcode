package com.codeprep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    @Test
    void findsTwoIndicesThatSumToTarget() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = TwoSum.twoSum(nums, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void findsTwoIndicesWithNegativeNumbers() {
        int[] nums = {-3, 4, 3, 90};
        int target = 0;

        int[] result = TwoSum.twoSum(nums, target);

        assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    void findsTwoIndicesWhenDuplicatesPresent() {
        int[] nums = {3, 3};
        int target = 6;

        int[] result = TwoSum.twoSum(nums, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }
}

