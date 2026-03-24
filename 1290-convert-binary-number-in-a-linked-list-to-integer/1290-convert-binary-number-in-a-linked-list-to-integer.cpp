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
    int getDecimalValue(ListNode* head) {
        ListNode* ptr = head;
        vector<int> arr;
        while (ptr != NULL) {
            arr.push_back(ptr->val);
            ptr = ptr->next;
        }
        int n = arr.size() - 1;
        int power = 1;
        int ans = 0;
        for (int i = n; i >= 0; i--) {
            ans += arr[i] * power;
            power *= 2;
        }
        return ans;
    }
};