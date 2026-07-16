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
    int max_idx(int lower, int upper,int[] nums) {
        int idx = lower;
        int max = Integer.MIN_VALUE;
        for (int i = lower; i < upper; i++) {
            if (nums[i] > max) {
                max = nums[i];
                idx = i;
            }
        }
        return idx;
    }
    TreeNode ans(int lower,int upper,int[] nums){
        if(lower >= upper) return null;

        int idx = max_idx(lower,upper,nums);
        TreeNode root = new TreeNode(nums[idx]);
        
        root.left = ans(lower,idx,nums);
        root.right = ans(idx+1,upper,nums);   
        return root;  
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return ans(0,nums.length,nums);
    }
}