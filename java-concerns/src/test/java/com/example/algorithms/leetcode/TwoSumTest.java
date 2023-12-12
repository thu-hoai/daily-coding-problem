package com.example.algorithms.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.algorithms.leetcode.FindDuplication.containsDuplicate;
import static com.example.algorithms.leetcode.TwoSum.twoSum;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSumTest {
    @ParameterizedTest
    @MethodSource("inputExpectedOutput")
    void testTwoSum(int[] nums, int target, int[] expected) {
        int[] result = twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    private static Stream<Arguments> inputExpectedOutput() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1})
        );
    }
}
