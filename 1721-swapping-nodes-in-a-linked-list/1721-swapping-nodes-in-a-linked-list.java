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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        
        for(int i=1;i<=k;i++)
               fast=fast.next;
    
        ListNode swapNode1=fast;
        
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        
        int temp=slow.next.val;
        slow.next.val=swapNode1.val;
        swapNode1.val=temp;
        
        return dummy.next;
        
    }
}