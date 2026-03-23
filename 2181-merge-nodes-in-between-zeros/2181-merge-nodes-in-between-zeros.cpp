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
        ListNode *curr = head;
        ListNode *next = head->next;
        ListNode *dummy = new ListNode(-1);
        ListNode *temp = dummy;
        int sum = 0;
        while(next->next != NULL){
            sum += next->val;
            next = next->next;
            if(next->val == 0){
                //cout<<sum<<" ";
                ListNode* node = new ListNode(sum);
                curr = node;
                temp->next = node;
                temp = temp->next;
                
                curr = next;
                sum = 0;
            }
        }
        return dummy->next;
    }
};