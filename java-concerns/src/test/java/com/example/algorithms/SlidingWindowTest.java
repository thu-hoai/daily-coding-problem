package com.example.algorithms;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.algorithms.grooking.SlidingWindow.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SlidingWindowTest {

    @ParameterizedTest
    @MethodSource("inputExpected")
    void testFindMaxAverage(int[] nums, int k, double expected) {
        assertEquals(expected, findMaxAverageSlidingWindow(nums, k));
        assertEquals(expected, minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
    }

    @ParameterizedTest
    @MethodSource("dataTestMinSubArrayLen")
    void testMinSubArrayLen(int target, int[] nums, int expected) {
        assertEquals(expected, minSubArrayLenSlidingWindow(target, nums));
        assertEquals(expected, minSubArrayLen(target, nums));
    }

    public static Stream<Arguments> dataTestMinSubArrayLen() {
        return Stream.of(
                Arguments.of(7, new int[] {2,3,1,2,4,3}, 2),
                Arguments.of(4, new int[] {1,4,4}, 1),
                Arguments.of(11, new int[] {1,1,1,1,1,1,1,1}, 0)
        );
    }


    private static Stream<Arguments> inputExpected() {
        return Stream.of(
                Arguments.of(new int[]{1, 12, -5, -6, 50, 3}, 4, 12.75),
                Arguments.of(new int[]{-1}, 1, -1.00000)
        );
    }
}
