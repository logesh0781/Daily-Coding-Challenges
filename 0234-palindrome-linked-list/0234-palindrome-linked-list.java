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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true; 
        int c=0,i=1;
        ListNode fh=head,t=head;
        while(t!=null){
            t=t.next;
            c++;
        }
        c=(c%2==0)?c/2:c/2+1;
        t=head;
        while(i<c){
            t=t.next;
            i++;
        }
        ListNode prev=t;
        ListNode sh=t.next;
        t=t.next.next;
        sh.next=null;
        while(t!=null){
            prev.next=t;
            t=t.next;
            prev.next.next=sh;
            sh=prev.next;
        }
        while(sh!=null){
            if(fh.val!=sh.val) return false;
            fh=fh.next;
            sh=sh.next;
        }
        return true;
    }
}