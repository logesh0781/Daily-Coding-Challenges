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
    public void reorderList(ListNode head) {
        if(head.next==null || head.next.next==null) return;
        ListNode t=head,sh=null;
        int c=0;
        while(t!=null){
            t=t.next;
            c++;
        }
        c=(c%2==0)?c/2:c/2+1;
        t=head;
        while(c>1){
            t=t.next;
            c--;
        }
        sh=t.next;
        ListNode prev=null;
        t.next=null;
        t=head;
        while(sh!=null){
            ListNode next=sh.next;
            sh.next=prev;
            prev=sh;
            sh=next;
        }
        while(prev!=null){
            ListNode ht=t.next;
            t.next=prev;
            prev=prev.next;
            t.next.next=ht;
            t=ht;
        }
    }
}