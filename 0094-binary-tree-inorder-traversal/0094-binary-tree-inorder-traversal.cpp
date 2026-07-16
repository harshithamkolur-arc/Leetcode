/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {   
public:  
    TreeNode* Inorder(TreeNode* root, vector<int> &ans){
        if(root == NULL) return NULL;
        Inorder(root->left,ans);
        ans.push_back(root->val);
        Inorder(root->right,ans);
        return root;
    }

    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> ans;
        Inorder(root,ans);
        return ans;
    }
};