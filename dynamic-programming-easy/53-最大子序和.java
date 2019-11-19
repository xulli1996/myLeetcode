/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if ( sum + nums[i] > 0 && sum >=0 ) {
                sum += nums[i];
            }else{
                sum = nums[i];
            }
            
            if (sum >= maxSum) maxSum = sum;
        }

        return maxSum;
    }
}
// @lc code=end

