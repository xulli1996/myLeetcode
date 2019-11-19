/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0);
        ListNode k = list;
        while(l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                list.next = l1;
                list = list.next;
                l1 = l1.next;
            } else {
                list.next = l2;
                list = list.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            list.next = l1;
            list = list.next;
            l1 = l1.next;
        }
        if (l2 != null) {
            list.next = l2;
            list = list.next;
            l2 = l2.next;
        }
        return k.next;
    }
}
// @lc code=end

