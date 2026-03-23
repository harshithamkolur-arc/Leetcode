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
    ListNode* mergeNodes(ListNode* head) {
        ListNode* ptr = head->next;
        ListNode* dummy = new ListNode(-1);
        ListNode* temp = dummy;
        int sum = 0;
        while (ptr != NULL) {
            if (ptr->val == 0) {
                ListNode* node = new ListNode(sum);
                temp->next = node;
                temp = temp->next;
                sum = 0;
            } else {
                sum += ptr->val;
            }
            ptr = ptr->next;
        }
        return dummy->next;
    }
};