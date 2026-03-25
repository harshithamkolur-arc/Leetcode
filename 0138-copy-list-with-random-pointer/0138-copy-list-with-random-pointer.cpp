/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;

    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

class Solution {
public:
    Node* copyRandomList(Node* head) {
        if(head == NULL){
            return NULL;
        }
        Node* newHead = new Node(head->val);
        Node* origptr = head->next;
        Node* copyptr = newHead;
        unordered_map<Node*, Node*> map;
        map[head] = newHead;
        while (origptr != NULL) {
            Node* copyNode = new Node(origptr->val);
            map[origptr] = copyNode;
            copyptr->next = copyNode;
            origptr = origptr->next;
            copyptr = copyptr->next;
        }
        origptr = head;
        copyptr = newHead;
        while (origptr != NULL) {
            copyptr->random = map[origptr->random];
            origptr = origptr->next;
            copyptr = copyptr->next;
        }
        return newHead;
    }
};