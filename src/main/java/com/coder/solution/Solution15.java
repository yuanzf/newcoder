package com.coder.solution;

import java.util.ArrayList;

/**
 * @Author: yzf
 * @Date: 2018/9/26 09:15
 * @Desoription: 输入一个链表，反转链表后，输出新链表的表头。
 * 坑：在将链表加入到list中时记得将next置为null，或者在重新构造链表的时候将next置为null。
 * 否则会形成一个环，系统遍历输出会陷入死循环。
 */
public class Solution15 {

    public static ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        ArrayList<ListNode> nodesList = new ArrayList<>();
        while (node != null) {
            nodesList.add(node);
            node = node.next;
        }
        head = nodesList.get(nodesList.size() - 1);
        node = head;
        for (int index = nodesList.size() - 2; index >= 0; index--) {
            ListNode node1 = nodesList.get(index);
            node1.next = null;
            node.next = node1;
            node = node.next;
        }
        return head;
    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}