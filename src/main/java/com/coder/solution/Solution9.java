package com.coder.solution;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: yzf
 * @Date: 2018/9/14 12:10
 * @Desoription: 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * f(n) = 1+f(1)+f(2)+ ... +f(n-1)     (1)
 * f(n-1) = 1+ f(1)+f(2)+ ... f(n-2)   (2)
 * 将公式（2）代入公式（1）
 * f(n) = 2f(n-1)
 */
public class Solution9 {
    /**
     * 使用迭代
     * @param target 台阶数
     * @return  跳法
     */
    public static int JumpFloorII(int target) {
        if(target<=2){
            return target;
        }
        return 2 * JumpFloorII(target - 1);
    }

    /**
     * 使用流处理
     * @param target 台阶数
     * @return 跳法
     */
    public static int JumpFloorII1(int target) {
        if(target<=2){
            return target;
        }
        Optional<Integer> collect = Stream.iterate(1, t -> 2 * t)
                .limit(target)
                .collect(Collectors.maxBy(Integer::compare));
            return  collect.orElse(0).intValue();
    }
}
