package com.imzt.one.q1_q50.q1;

import com.imzt.one.basic.ListNode;

/**
 * q: <a href="https://leetcode.cn/problems/add-two-numbers/">link</a>
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode node = result;
        int up = 0;
        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += up;
            up = sum / 10;
            node.next = new ListNode(sum % 10);
            node = node.next;
        }
        if (up == 1) {
            node.next = new ListNode(up);
        }
        return result.next;
    }
}
