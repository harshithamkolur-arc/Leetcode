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
    int divisor(int a,int b){
        int temp;
        while(b!=0){
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    ListNode* insertGreatestCommonDivisors(ListNode* head) {
        ListNode *curr = head;
        ListNode *nxt = head->next;
        while(nxt != NULL){
            ListNode *node = new ListNode(divisor(curr->val,nxt->val));
            node->next = nxt;
            curr->next = node;

            nxt = nxt->next;
            curr = node->next;
        }
        return head;
    }
};