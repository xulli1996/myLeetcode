/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        StringBuffer aBuffer = new StringBuffer();
        int sum = 0;
        int carry = 0;
        for(int i = a.length()-1, j = b.length()-1; i >= 0 || j >= 0; i--,j--) {
            sum = carry;
            sum = sum + (i < 0 ? 0 : a.charAt(i)-'0');
            sum = sum + (j < 0 ? 0 : b.charAt(j)-'0');
            aBuffer.append(sum%2);
            carry = sum/2;
        }
        aBuffer.append((carry == 1 ? 1 : ""));
        return aBuffer.reverse().toString();
    }
}
// @lc code=end

