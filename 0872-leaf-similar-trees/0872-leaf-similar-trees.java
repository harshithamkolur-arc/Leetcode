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
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    void tree1(TreeNode root1) {
        if (root1 == null)
            return;
        if (root1.left == null && root1.right == null) {
            list1.add(root1.val);
            return;
        }
        tree1(root1.left);
        tree1(root1.right);
    }
    void tree2(TreeNode root2) {
        if (root2 == null)
            return;
        if (root2.left == null && root2.right == null) {
            list2.add(root2.val);
            return;
        }
        tree2(root2.left);
        tree2(root2.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {       
        tree1(root1);
        tree2(root2);     
        if(list1.size() != list2.size()) return false; 
        for(int i=0;i<list1.size();i++){
            if(!list1.get(i).equals(list2.get(i))) return false;
        }
        return true;
    }
}