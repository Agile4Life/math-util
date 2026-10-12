package com.phongtct.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static com.phongtct.mathutil.core.MathUtil.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilDDTTest {
        public static Object[][] initTestData() {
            Object[][] testData ={
                    {0, 1},
                    {1, 1},
                    {2, 2},
                    {3, 6},
                    {4, 24},
                    {5, 120},
                    {6, 720}
            };
            return testData;
        }

        @ParameterizedTest
        @MethodSource("initTestData")
        public void testFactorialGivenValidNRunsWell(int n, long expected) {
            assertEquals(expected, getFactorial(n));
    }
}