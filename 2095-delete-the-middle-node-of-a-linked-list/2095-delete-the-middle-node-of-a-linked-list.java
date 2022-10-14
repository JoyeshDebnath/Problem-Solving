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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null)
            return null;
        
        
        ListNode  fastPtr=head;
        ListNode slowPtr=head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prev=dummy;
        
        //find the middle node 
        while(fastPtr!=null && fastPtr.next!=null)
        {
            prev=prev.next;
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
        }//
        
        prev.next=slowPtr.next;
        slowPtr.next=null;
        
        return dummy.next;
    }
}