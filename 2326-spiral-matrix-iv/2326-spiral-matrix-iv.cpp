/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> spiralMatrix(int m, int n, ListNode* head) {
        vector<vector<int>> mat(m, vector<int>(n,-1));
        ListNode* ptr = head;
        int Cst = 0;
        int Cend = n - 1;
        int Rst = 0;
        int Rend = m - 1;
        while (Cst <= Cend && Rst <= Rend) {
            for (int i = Cst; i <= Cend; i++) {
                if (ptr) {
                    mat[Rst][i] = ptr->val;
                    ptr = ptr->next;
                }
            }
            Rst++;
            for (int i = Rst; i <= Rend; i++) {
                if (ptr) {
                    mat[i][Cend] = ptr->val;
                    ptr = ptr->next;
                }
                     
            }
            Cend--;
            if (Rst <= Rend){
                for (int i = Cend; i >= Cst; i--) {
                if (ptr) {
                    mat[Rend][i] = ptr->val;
                    ptr = ptr->next;
                } 
            }
            Rend--;
            }
            if (Cst <= Cend){
                for (int i = Rend; i >= Rst; i--) {
                if (ptr) {
                    mat[i][Cst] = ptr->val;
                    ptr = ptr->next;
                } 
            }
            }
            Cst++;
        }
        return mat;
    }
};