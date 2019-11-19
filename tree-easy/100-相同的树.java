import java.util.ArrayDeque;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=100 lang=java
 *
 * [100] 相同的树
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
// 递归-先序遍历
// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         if(p == null && q == null) {
//             return true;
//         }
//         if (p == null || q == null) {
//             return false;
//         }
//         if (p.val != q.val) {
//             return false;
//         }
//         return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//     }   
// }

//层次遍历
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (!check(p,q)) {
            return false;
        }
        //init queue
        Queue<TreeNode> queueP = new ArrayDeque<>();
        Queue<TreeNode> queueQ = new ArrayDeque<>();
        // add root node to queue 
        queueP.add(p);
        queueQ.add(q);

        //开始层次遍历
        while (!queueP.isEmpty()) {
            //remove node from queue
            p = queueP.remove();
            q = queueQ.remove();
            if (!check(p,q)) {
                return false;
            }
            // in Java nulls are not allowed in Deque
            //check p subnode and q subnode
            if (!check(p.left,q.left)) {
                return false;
            }
            if (p.left != null) {
                queueP.add(p.left);
                queueQ.add(q.left);
            }
            if (!check(p.right,q.right)) {
                return false;
            }
            if (p.right != null) {
                queueP.add(p.right);
                queueQ.add(q.right);
            }
        }
        return true;
    }
    
    //检查节点
    private boolean check(TreeNode p, TreeNode q) {
        //if p and q are null
        if(p == null && q == null) {
            return true;
        }
        //if one of p ,q is null
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return true;
    }
}
// @lc code=end

