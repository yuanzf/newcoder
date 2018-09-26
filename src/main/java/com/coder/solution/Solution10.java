package com.coder.solution;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: yzf
 * @Date: 2018/9/14 18:08
 * @Desoription: 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * <p>
 * 分析：
 * 假设2*n的大矩形有f(n)种方法
 * 如下是2*n的大矩形
 *              ***********
 *              ***********
 * 则2*(n+1)
 *              ************
 *              ************
 * 2*(n+1）可以分为两部分如下所示
 * <p>
 * 2*n + 2*1
 *              *********** *
 *              *********** *
 * 这个又f(n)种方法
 * 2*(n-1) + 2*2
 *              ********** **
 *              ********** **
 * 这有2*f(n-1）中方法，但是有一种方法和上面的重复
 * 因此f(n+1) = f(n) + f(n-1)
 * <p>
 * <p>
 * 斐波拉切函数
 */
public class Solution10 {
    public int RectCover(int target) {
        Optional<Integer> collect = Stream.iterate(new int[]{1, 2}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(target)
                .map(x -> x[0])
                .collect(Collectors.maxBy(Integer::compareTo));

        return collect.orElse(0);
    }
}
