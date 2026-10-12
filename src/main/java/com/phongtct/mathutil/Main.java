package com.phongtct.mathutil;

import com.phongtct.mathutil.core.MathUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TDD - Viết code bắt đầu từ viết test
        testFactorialGivenValidN5ReturnsWell120();

    }
    public static void testFactorialGivenValidN5ReturnsWell120() {
        long expected = 120;
        int n = 5;
        long actual = MathUtil.getFactorial(n);
        System.out.println("5!: | expected: " + expected + " | actual: " + actual);
    }
}
