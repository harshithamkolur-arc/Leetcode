/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        int n = 0;
        ListNode ptr = head;
        while (ptr != null) {
                ptr = ptr.next;
                n++;
            }
            k = k % n;
            System.out.println(k);
        while (k != 0) {
            ptr = head;
            while (ptr.next.next != null) {
                ptr = ptr.next;
            }
            ptr.next.next = head;
            head = ptr.next;
            ptr.next = null;
            k--;
        }
        return head;
    }
}