package com.coder.solution;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: yzf
 * @Date: 2018/9/14 11:51
 * @Desoription:
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * 分析：n级台阶有f(n)种跳法
 *    假设第一次跳1级，则剩下的n-1级有f(n-1）中跳法；
 *    假设第一次跳2级,则剩下的n-1级有f(n-2）种跳法
 *    则f(n) = f(n-1) +  f(n-2);  既斐波那契函数，同第七题
 */
public class Solution8 {
    /**使用流来处理
     * @param target
     * @return
     */
    public int JumpFloor(int target) {
        Optional<Integer> collect = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(target)
                .map(x ->x[0] + x[1])
                .collect(Collectors.maxBy(Integer::compare));
        return collect.orElse(0);
    }


    /**
     * 使用迭代来处理(更直观，但是性能不能流处理）
     * @param target
     * @return
     */
    public int iterationJumpFloor(int target){
        if (target<=2){
            return target;
        }
        return iterationJumpFloor(target-1)+iterationJumpFloor(target-2);
    }
}
