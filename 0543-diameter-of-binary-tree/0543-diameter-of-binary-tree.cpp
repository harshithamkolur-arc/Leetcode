/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left),
 * right(right) {}
 * };
 */

class Solution {
public:
    int ans = 0;
    int dia(TreeNode* root) {
        if (root == NULL)
            return 0;
        int left_ht = dia(root->left);
        int right_ht = dia(root->right);
        ans = max(left_ht + right_ht, ans);
        return max(left_ht, right_ht) + 1;
    }
    int diameterOfBinaryTree(TreeNode* root) {
        dia(root);
        return ans;
    }
};