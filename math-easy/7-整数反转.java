/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int tmp = x % 10;
            
            if (reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE/10 && tmp > 7)) {
                return 0;                
            }
            if (reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE/10 && tmp < -8)) {
                return 0;                
            }
            reverse = reverse*10+tmp;
            x = x/10;
        }
        return reverse;
    }
}
// @lc code=end

