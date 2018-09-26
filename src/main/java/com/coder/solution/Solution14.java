package com.coder.solution;

/**
 * @Author: yzf
 * @Date: 2018/9/25 19:21
 * @Desoription: 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Solution14 {

    public static ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int count = 0;
        ListNode node = head;
        while (node != null) {
            count++;
            node = node.next;
        }
        if (k > count) {
            return null;
        }
        node = head;
        for (int i = 0; i < count - k; i++) {
            node = node.next;
        }
        return node;
    }
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}

