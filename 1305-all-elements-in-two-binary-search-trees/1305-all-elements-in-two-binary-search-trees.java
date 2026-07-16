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
    void traverse1(TreeNode root1,List<Integer> arr){
        if(root1==null) return;
        arr.add(root1.val);
        traverse1(root1.left,arr);
        traverse1(root1.right,arr);
    }

    void traverse2(TreeNode root2,List<Integer> arr){
        if(root2==null) return;
        arr.add(root2.val);
        traverse2(root2.left,arr);
        traverse2(root2.right,arr);
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> arr = new ArrayList<>();
        traverse1(root1,arr);
        traverse2(root2,arr);
        Collections.sort(arr);
        return arr;
    }
}