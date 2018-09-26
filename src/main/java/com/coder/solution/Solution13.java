package com.coder.solution;

import java.util.ArrayList;

/**
 * @Author: yzf
 * @Date: 2018/9/25 18:52
 * @Desoription:
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Solution13 {
    public void reOrderArray(int [] array) {
        int count = 0;
        ArrayList<Integer> oddNumber = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 0) {
                even.add(array[index]);
            } else {
                oddNumber.add(array[index]);
            }
        }
        for (int i = 0; i < oddNumber.size(); i++) {
            array[count] = oddNumber.get(i);
            count++;
        }
        for (int i = 0; i < even.size(); i++) {
            array[count] = even.get(i);
            count++;
        }
    }
}
