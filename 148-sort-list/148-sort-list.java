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
      public ListNode findMid(ListNode node){
        // if(node==null || node.next==null)
        //          return node;
        
        ListNode fastPointer=node;
        ListNode slowPointer=node;
        
        while(fastPointer.next!=null && fastPointer.next.next!=null)
        {
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }
        
        return slowPointer;
          
    }//return the mid node 
    
    public ListNode Merge(ListNode node1,ListNode node2){
        
        if(node1==null)
               return node2;
        if(node2==null)
               return node1;
        
        ListNode c1=node1;
        ListNode c2=node2;
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        
        while(c1!=null && c2!=null)
        {
            if(c1.val<=c2.val){
                curr.next=c1;
                c1=c1.next;
            }
            else{
                curr.next=c2;
                c2=c2.next;
            }
            curr=curr.next;
        }
        while(c1!=null){
            curr.next=c1;
            c1=c1.next;
            curr=curr.next;
        }
        
        while(c2!=null){
            curr.next=c2;
            c2=c2.next;
            curr=curr.next;
        }
        
        return dummy.next;
        
    }//merge 2 soretd  lists 
    
    
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode midNode=findMid(head);
        ListNode NextTo_midNode=midNode.next;
        midNode.next=null;
        
        ListNode l1=sortList(head);
        ListNode l2=sortList(NextTo_midNode);
        
        return Merge(l1,l2);
    }
}