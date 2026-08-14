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
    public ListNode middleNode(ListNode head) {
        int c=0;
        ListNode t=head;
        while(t!=null){
            c++;
            t=t.next;
        }
        c=c/2;
        t=head;
        while(c!=0){
            c--;
            t=t.next;
        }
        return t;
    }
}