import java.util.ArrayList;
import java.util.List;


/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return result;
        }
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> pre = result.get(i-1);
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(pre.get(j-1)+pre.get(j));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
// @lc code=end

