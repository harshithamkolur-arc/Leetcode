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
    bool compare(TreeNode* p, TreeNode* q){
        if(p == NULL || q == NULL) return p == q;   
        return compare(p->left,q->left) && compare(p->right,q->right) && p->val == q->val;
    }

    bool isSameTree(TreeNode* p, TreeNode* q) {
        return compare(p,q);
    }
};