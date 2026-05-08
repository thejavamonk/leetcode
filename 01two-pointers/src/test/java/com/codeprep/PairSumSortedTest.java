package com.codeprep;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PairSumSortedTest {

    @Test
    void findsPairForSortedInput() {
        ArrayList<Integer> nums = new ArrayList<>(List.of(-5, -2, 3, 4, 6));

        ArrayList<Integer> result = PairSumSorted.pair_sum_sorted(nums, 7);

        assertEquals(2, result.size());
        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
    }
}

