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
    bool identical(TreeNode* root,TreeNode* subRoot){
        if(root == NULL || subRoot == NULL) return root == subRoot;
        bool left = identical(root->left,subRoot->left);
        bool right = identical(root->right,subRoot->right);
        return left && right && root->val == subRoot->val;
    }
    bool subtree(TreeNode* root, TreeNode* subRoot){
        if(root == NULL || subRoot == NULL) return root == subRoot;
        if(root->val == subRoot->val && identical(root,subRoot)){
            return true;
        }
        return subtree(root->left,subRoot) || subtree(root->right,subRoot);
    }
    bool isSubtree(TreeNode* root, TreeNode* subRoot) {
        return subtree(root,subRoot);
    }
};