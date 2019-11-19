/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        //进位
        int carry = 1;
        for (int i = digits.length-1; i >= 0 && carry == 1; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                carry = 0;
            }else{
                digits[i] = 0;
                carry = 1;
            }
        }
        //overflow
        if (carry == 1) {
            int [] result = new int[digits.length+1];
            System.arraycopy(digits, 0, result, 1, digits.length);
            result[0] = 1;
            return result;
        }
        return digits;
    }
}
// @lc code=end

