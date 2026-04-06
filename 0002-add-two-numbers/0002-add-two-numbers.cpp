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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* ptr1 = l1;
        ListNode* ptr2 = l2;
        ListNode* ans = new ListNode(-1);
        ListNode* ptr3 = ans;
        int carry = 0;
        int val = 0;
        while(ptr1 != NULL && ptr2!=NULL){
            val = ptr1->val + ptr2->val + carry;
            if(val >= 10){
                val -= 10;
                carry = 1;
            }
            else carry = 0;
            ListNode* node = new ListNode(val);
            ptr3->next = node;
            ptr3 = node;
            ptr1 = ptr1->next;
            ptr2 = ptr2->next;
        }
        while(ptr1 != NULL){
            val = ptr1->val + carry;
            if(val >= 10){
                val -= 10;
                carry = 1;
            }
            else carry = 0;
            ListNode* node = new ListNode(val);
            ptr3->next = node;
            ptr3 = node;
            ptr1 = ptr1->next;
        }
        while(ptr2 != NULL){
            val = ptr2->val + carry;
            if(val >= 10){
                val -= 10;
                carry = 1;
            }
            else carry = 0;
            ListNode* node = new ListNode(val);
            ptr3->next = node;
            ptr3 = node;
            ptr2 = ptr2->next;
        }
        if (carry != 0){
            ListNode* node = new ListNode(carry);
            ptr3->next = node;
        }
        return ans->next;
    }
};