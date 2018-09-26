package com.coder.solution;

import java.util.ArrayList;

/**
 * @Author: yzf
 * @Date: 2018/9/26 09:36
 * @Desoription: 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Solution16 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode result = null;
        ListNode node= null;
        ListNode node1 = list1;
        ListNode node2 = list2;
        ArrayList<ListNode> listNodes = new ArrayList<>();
        while (node1 != null || node2 != null) {
            if (node1 == null) {
                while (node2 != null) {
                    listNodes.add(node2);
                    node2 = node2.next;
                }
                break;
            }
            if (node2 == null) {
                while (node1 != null){
                    listNodes.add(node1);
                    node1 = node1.next;
                }
                break;
            }
            if (node1.val > node2.val) {
                listNodes.add(node2);
                node2 = node2.next;
                continue;
            } else  {
                listNodes.add(node1);
                node1 = node1.next;
                continue;
            }
        }
        result=listNodes.get(0);
        node=result;
        for (int index=1;index<listNodes.size();index++){
            ListNode tmp = listNodes.get(index);
            tmp.next=null;
            node.next=tmp;
            node=node.next;
        }
        return result;
    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}