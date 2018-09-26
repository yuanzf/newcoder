package com.coder.solution;

import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.Collectors;
/**
 * @Author: yzf
 * @Date: 2018/9/13 18:56
 * @Desoription:
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 * 解题思路
 *      可以Stream生成无限流来生成斐波那契函数，避免用迭代可以大大的提高性能。
 */
public class Solution7 {
    public static int Fibonacci(int n) {
        Optional<Integer> collect = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(n)
                .map(x -> x[1])
                .collect(Collectors.maxBy(Integer::compare));
        return collect.orElse(0);
    }
}
