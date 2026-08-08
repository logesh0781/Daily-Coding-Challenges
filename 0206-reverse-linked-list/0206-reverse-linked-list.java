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
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        ListNode r=new ListNode(0),t=head;;
        while(t!=null){
            ListNode next=t.next;
            t.next=r.next;
            r.next=t;
            t=next;
        }
        return r.next;
    }
}