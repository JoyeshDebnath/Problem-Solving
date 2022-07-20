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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        
        while(l1!=null && l2!=null)
        {
            int sum=l1.val+l2.val+carry;
            carry=(sum>9)?1:0;
            
            ListNode new_node=new ListNode(sum%10);
            curr.next=new_node;
            curr=curr.next;
            l1=l1.next;
            l2=l2.next;
            
        }
        
        while(l1!=null)
        {
            int sum=l1.val+carry;
            ListNode new_node=new ListNode(sum%10);
            carry=(sum>9)?1:0;
            curr.next=new_node;
            curr=curr.next;
            l1=l1.next;
        }
        while(l2!=null)
        {
        int sum=l2.val+carry;
            ListNode new_node=new ListNode(sum%10);
            carry=(sum>9)?1:0;
            curr.next=new_node;
            curr=curr.next;
            l2=l2.next;
        }
        
        
        if(carry!=0)
        {
            ListNode new_node=new ListNode(carry);
            curr.next=new_node;
            curr=curr.next;
        }
        return dummy.next;
    }
}