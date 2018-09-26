package com.coder.solution;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: yzf
 * @Date: 2018/9/13 18:40
 * @Desoription:
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *  解题思路：使用流处理，对于输出或者集合的处理都可以使用流处理，可以大大的简化代码复杂度
 */
public class Solution6 {
    public int minNumberInRotateArray(int [] array) {
        ArrayList<Integer> integers = new ArrayList<>();

        if (array == null || array.length == 0){
            return 0;
        }
        for (int i=0; i<array.length; i++){
            integers.add(array[i]);
        }
        Optional<Integer> collect = integers.stream().collect(Collectors.minBy( Integer::compare));
        return collect.get();
    }
}
