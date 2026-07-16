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
    int ans = 0;
    void binary(TreeNode root, int val) {
        if (root == null)
            return;

        val = val * 2 + root.val;

        if (root.left == null && root.right == null) {
            ans += val;
        }
        binary(root.left, val);
        binary(root.right, val);
    }

    public int sumRootToLeaf(TreeNode root) {
        binary(root, 0);
        return ans;
    }
}