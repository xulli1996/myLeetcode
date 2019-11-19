/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if ( n == 0 ) {
            return;
        }
        if ( m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        for (int i = m+n-1; i >= 0; i--) {
            if (nums1[m-1] > nums2[n-1]) {
                nums1[i] = nums1[m-1];
                m--;
            }else {
                nums1[i] = nums2[n-1];
                n--;
            }
            if (m == 0) {
                System.arraycopy(nums2, 0, nums1, 0, n);       
                return;
                }
            if (n == 0) {
                return;
            }
        }
    }
}
// @lc code=end

