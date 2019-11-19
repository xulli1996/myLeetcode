/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode p = headA;
        ListNode q = headB;
        int lenDiff= 0;
        //求两个链表长度
        while (p != null) {
            lenDiff++;
            p = p.next;
        }
        while (q != null) {
            lenDiff--;
            q = q.next;
        }
        //长的链表先开始遍历
        while (lenDiff > 0) {
            lenDiff--;
            headA = headA.next;
        }
        while (lenDiff < 0) {
            lenDiff++;
            headB = headB.next;
        }

        while (headA != null && headB != null) {
            if(headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
// @lc code=end

