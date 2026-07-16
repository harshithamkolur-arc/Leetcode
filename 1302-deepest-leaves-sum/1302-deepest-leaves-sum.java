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
    int max_depth = -1;
    int sum = 0;
    void depth(TreeNode root,int curr_depth) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if(curr_depth > max_depth){
                max_depth = curr_depth;
                sum = root.val;
            }
            else if(curr_depth == max_depth){
                sum += root.val;
            }
        }
        depth(root.left,curr_depth + 1);
        depth(root.right,curr_depth + 1);
    }

    public int deepestLeavesSum(TreeNode root) {
        depth(root,0);
        return sum;
    }
}