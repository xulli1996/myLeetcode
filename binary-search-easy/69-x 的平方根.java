/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1 || x == 2 || x == 3) {
            return 1;
        }
        if (x == 4) {
            return 2;
        }
        long left = 0;
        long right = x/2;
        while (left <= right) {
            long mid = (left+right) >>> 1;
            long sqrt = mid*mid;
            if(sqrt > x){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        //向下取整
        return (int)left-1;
    }
}
// @lc code=end

