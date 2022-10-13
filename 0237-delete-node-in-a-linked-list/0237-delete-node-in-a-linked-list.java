/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode curr=node;
    
        while(curr.next.next!=null)
        {
            
            int temp=curr.val;
            curr.val=curr.next.val;
            curr.next.val=temp;
            curr=curr.next;
        }
            int temp=curr.val;
            curr.val=curr.next.val;
            curr.next.val=temp;
         
        
        curr.next=null;
    }
}