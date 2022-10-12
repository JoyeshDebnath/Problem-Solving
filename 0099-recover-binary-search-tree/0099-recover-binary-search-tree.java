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
    TreeNode prev=null;
    TreeNode first=null;
    TreeNode last=null;
    
    public void recoverTree(TreeNode root) {
        
        inOrder(root);
        int temp=first.val;
        first.val=last.val;
        last.val=temp;
    
    }
    
    void inOrder(TreeNode root){
        if(root==null)
               return ;
        
        inOrder(root.left);
        
        if(prev!=null){
            if(prev.val>root.val){
                if(first==null)
                        first=prev;
                last=root;
            }
        }
        prev=root;
        inOrder(root.right);
    }
}