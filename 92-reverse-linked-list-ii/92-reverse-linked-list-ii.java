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
    
    public ListNode findPoint(int left,ListNode head){
        int counter=1;  
        while(counter<left){
            head=head.next;
            counter++;
        }
        return head;
    }
    
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode firstPoint=findPoint(left,dummy);
        ListNode FirstHead=firstPoint.next;
        
        ListNode prev=null;
        ListNode curr=FirstHead;
        ListNode next=null;
        int cnt=left;
        while(curr!=null && cnt<=right){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            cnt++;
        }
        
        firstPoint.next=prev;
        FirstHead.next=next;
        return dummy.next;
        
    }
}