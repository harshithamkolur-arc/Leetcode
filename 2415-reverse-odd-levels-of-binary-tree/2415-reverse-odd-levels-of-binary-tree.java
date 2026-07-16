/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    void ans(TreeNode left,TreeNode right,int depth) {
        if (left == null || right == null)
            return;
        
        if (depth % 2 != 0) {
            int temp = right.val;
            right.val = left.val;
            left.val = temp;
        }
        ans(left.left,right.right,depth+1);
        ans(left.right,right.left,depth+1);
    }

    public TreeNode reverseOddLevels(TreeNode root) {
        ans(root.left,root.right,1);
        return root;
    }
}