/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 求众数
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        return subMajorityElement(nums, 0, nums.length-1);
    }
    private int subMajorityElement(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        int mid = (left+right)>>>1;
        int leftNumber = subMajorityElement(nums, left, mid);
        int rightNumber = subMajorityElement(nums, mid+1, right);
        if (leftNumber == rightNumber) {
            return leftNumber;
        }
        int leftCount = countNumber(nums, leftNumber, left, right);
        int rightCount = countNumber(nums, rightNumber, left, right);
        return leftCount > rightCount ? leftNumber : rightNumber;
    }
    private int countNumber(int[] nums, int num, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (num == nums[i]) {
                count++;
            }
        }
        return count;
    }
}
// @lc code=end

