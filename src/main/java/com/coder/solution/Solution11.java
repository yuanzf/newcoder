package com.coder.solution;

/**
 * @Author: yzf
 * @Date: 2018/9/25 18:18
 * @Desoription: 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 分析：
 * 补充知识：{
 *      补码：正数的补码就是其本身。
 *          负数的是吗是在其原码的基础上，符号位不变，其余各位取反最后的+1（在反码的基础上+1）；
 *     异或：两个操作数的胃中，相同则为0，不同则为1.
 * }
 * 对于输入的正数直接使用Integer自带的函数转化为二级制即可，
 * 对于负数使用异或可以很快求出补码，其中Integer.MAX_VALUE=0X7FFFFFFF;
 * 与输入值异或刚好是负数的补码；
 */
public class Solution11 {
    public int NumberOf1(int n) {
        int count = 0;
        String binaryString;
        if (n > 0) {
            binaryString = Integer.toBinaryString(n);
        } else {
            int i = n ^ Integer.MAX_VALUE + 1;
            binaryString = Integer.toBinaryString(n);
        }
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
