/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x != 0 && x % 10 == 0) {
            return false;
        }
        int tmp = 0;
        while (x > tmp) {
            tmp = tmp*10+x%10;
            x = x/10;
        }
        return x == tmp || x == tmp / 10;
    }
}
// @lc code=end

