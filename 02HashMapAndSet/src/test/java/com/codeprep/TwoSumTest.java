package com.codeprep;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSumTest {

    @Test
    void findsTwoIndicesThatSumToTarget() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 7, 11, 15));
        int target = 9;

        ArrayList<Integer> result = TwoSum.pair_sum_unsorted(nums, target);

        assertEquals(new ArrayList<>(Arrays.asList(0, 1)), result);
    }

    @Test
    void findsTwoIndicesWithNegativeNumbers() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(-3, 4, 3, 90));
        int target = 0;

        ArrayList<Integer> result = TwoSum.pair_sum_unsorted(nums, target);

        assertEquals(new ArrayList<>(Arrays.asList(0, 2)), result);
    }

    @Test
    void findsTwoIndicesWhenDuplicatesPresent() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 3));
        int target = 6;

        ArrayList<Integer> result = TwoSum.pair_sum_unsorted(nums, target);

        assertEquals(new ArrayList<>(Arrays.asList(0, 1)), result);
    }
}

