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
    int[] ans(TreeNode root) {
        if (root == null)
            return new int[]{0,0};
        int[] left = ans(root.left);
        int[] right = ans(root.right);
        int sum = left[0] + right[0] + root.val;
        int node = left[1] + right[1] + 1;
        int avg = sum / node;
        System.out.println(avg);
        if(avg == root.val) ans++;
        return new int[] {sum,node};
    }

    public int averageOfSubtree(TreeNode root) {
        ans(root);
        return ans;
    }
}