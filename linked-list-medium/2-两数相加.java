/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode(0);
        ListNode returnSum = sum;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int tmp1 = l1 == null ? 0 : l1.val;
            int tmp2 = l2 == null ? 0 : l2.val;
            int tmp = 0;
            if(carry == 1) tmp++;
            tmp += tmp1+tmp2;
            carry = tmp/10;
            sum.next = new ListNode(tmp%10);
            sum = sum.next;
            if (l1 != null) {
                l1=l1.next;
            }
            if (l2 != null) {
                l2=l2.next;
            }
        }
        if(carry == 1) {
            sum.next = new ListNode(1);
            sum = sum.next;
        }
        sum.next = null;
        return returnSum.next;
    }
}
// @lc code=end

