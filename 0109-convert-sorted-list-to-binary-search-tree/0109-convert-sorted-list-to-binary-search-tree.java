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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int countNodes(ListNode head){
        ListNode curr=head;
        int counter=0;
        while(curr!=null)
        {
            curr=curr.next;
            counter++;
        }
        return counter;
    }
    ListNode Head;
    public TreeNode sortedListToBST(ListNode head) {
        Head=head;
        int n=countNodes(head);
        return convert(n);
        
    }
    
    TreeNode convert(int n){
        if(n<=0)
                 return null;
        
        TreeNode left=convert(n/2);
        TreeNode root=new TreeNode(Head.val);
        
        root.left=left;
        Head=Head.next;
        root.right=convert(n-n/2-1);
        return root;
    }
}