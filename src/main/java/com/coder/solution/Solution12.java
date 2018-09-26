package com.coder.solution;

/**
 * @Author: yzf
 * @Date: 2018/9/25 18:44
 * @Desoription: 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Solution12 {

    public double Power(double base, int exponent) {
        double result = 1;
        int power = Math.abs(exponent);
        if (exponent == 0) {
            return 1;
        }
        for (int i = 0; i < power; i++) {
            result = result * base;
        }
        if (exponent < 0) {
            return 1 / result;
        }
        return result;
    }

}
