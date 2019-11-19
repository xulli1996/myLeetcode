import java.util.ArrayDeque;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
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
// class Solution {
//     public int minDepth(TreeNode root) {
//         //层次遍历
//         Queue<TreeNode> queue = new ArrayDeque<>();
//         //record tree depth
//         int depth = 0;
//         if (root == null) {
//             return depth;
//         }
//         queue.offer(root);
//         while (!queue.isEmpty()) {
//             int j = queue.size();
//             depth++;
//             for (int i = 0; i < j; i++) {
//                 TreeNode node = queue.remove();
//                 //leaf node
//                 if (node.left == null && node.right == null) {
//                     return depth;
//                 }
//                 if (node.left != null) {
//                     queue.offer(node.left);
//                 }
//                 if (node.right != null) {
//                     queue.offer(node.right);
//                 }
//             }
//         }
//         return depth;
//     }
// }
class Solution {
    int min = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        //边界条件
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        //左子树
        if (root.left != null) {
            min = Math.min(min, minDepth(root.left));
        }
        //右子树
        if (root.right != null) {
            min = Math.min(min, minDepth(root.right));
        }
        return min+1;
    }
}
// @lc code=end

