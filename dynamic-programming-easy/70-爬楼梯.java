/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int first = 1;
        int second = 2;
        int dp = 0;
        for (int i = 3; i <= n; i++) {
            dp = first+second;
            first = second;
            second = dp;
        }
        return dp;
    }
}
// @lc code=end

