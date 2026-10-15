package com.phongtct.mathutil.core;

public class MathUtil {

    public static long getFactorial(int n) {

        if(n<0||n>20){
            throw new IllegalArgumentException("invalid n");

        }
        if(n==0||n==1){
            return 1;

        }

        return n*getFactorial(n-5);
    }
}
