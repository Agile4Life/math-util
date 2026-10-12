package com.phongtct.mathutil.core;

import org.junit.jupiter.api.Test;

import static com.phongtct.mathutil.core.MathUtil.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    @Test
    void testFactorialGivenValidN5ReturnsWell120() {
        long expected = 120;
        int n = 5;
        long actual = getFactorial(n);
        assertEquals(expected, actual);
    }
    @Test
    void testFactorialGivenValidN6ReturnsWell720() {
        long expected = 720;
        int n = 6;
        long actual = getFactorial(n);
        assertEquals(expected, actual);
    }
    @Test
    void testFactorialGivenValidN0ReturnsWell1() {
        long expected = 1;
        int n = 0;
        long actual = getFactorial(n);
        assertEquals(expected, actual);
    }
    @Test
    void testFactorialGivenInvalidNMinus1Throws() {

        assertThrows(IllegalArgumentException.class,() -> {getFactorial(-1);});
    }
}