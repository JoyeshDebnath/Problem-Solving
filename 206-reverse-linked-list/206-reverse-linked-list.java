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
    ListNode tempHead=null;
    public ListNode reverseList(ListNode head) {
         if(head==null || head.next==null)
                  return head;
        
          
        ListNode curr=head;
        while(curr!=null){
            ListNode Next=curr.next;
            curr.next=null;
            AddFirst(curr);
            curr=Next;
        }
        return tempHead;
        
    }
    
    public void AddFirst(ListNode node)
    {
          if(tempHead==null)
          {
              tempHead=node;
              return;
          }
        else 
        {
            node.next=tempHead;
            tempHead=node;
        }
    }
}