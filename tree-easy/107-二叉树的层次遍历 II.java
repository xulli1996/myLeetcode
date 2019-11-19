import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;



/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层次遍历 II
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import javafx.util.Pair;
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<Pair<TreeNode,Integer>> queue = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        queue.offer(new Pair<TreeNode,Integer>(root, 0));
        while (!queue.isEmpty()) {
            Pair<TreeNode,Integer> tmp = queue.poll();
            if (res.size() <= tmp.getValue()) {
                res.add(new ArrayList<>());
            }
            res.get(tmp.getValue()).add(tmp.getKey().val);
            if (tmp.getKey().left != null) {
                queue.offer(new Pair<TreeNode,Integer>(tmp.getKey().left, tmp.getValue()+1));
            }
            if (tmp.getKey().right != null) {
                queue.offer(new Pair<TreeNode,Integer>(tmp.getKey().right, tmp.getValue()+1));
            }
        }
        Collections.reverse(res);
        return res;
    }
}
// @lc code=end

