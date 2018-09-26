package com.coder.solution;

import java.util.Stack;

/**
 * @Author: yzf
 * @Date: 2018/9/13 17:53
 * @Desoription: 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * 分析：
 * 栈是现今后出，队列是先进先出
 * 此处不能使用流遍历，如果使用流遍历stack1和stack2的顺序是一样的。
 * stack1:保存队列的顺序，
 * stack2：保存相反的顺序
 */
public class Solution5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        int capacity = stack1.size();
        int result = 0;
        if (capacity == 0) {
            System.out.println("队列为空");
        } else {
            for (int i = 0; i < capacity; i++) {
                stack2.push(stack1.pop());
            }
            result = stack2.pop();
            int index = stack2.size();
            for (int i = 0; i < index; i++) {
                stack1.push(stack2.pop());
            }
        }
        return result;
    }
}
