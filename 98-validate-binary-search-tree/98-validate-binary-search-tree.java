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
    TreeNode prevNode=null;
    boolean  flag=true;
    
    public boolean isValidBST(TreeNode root) {
        
        if(root==null)
               return true;
        
        inorder(root);
        if(flag==false)
               return false;
        
            return true;
    }
    
    void inorder(TreeNode root){
        if(root==null)
                  return;
        
        inorder(root.left);
        
        if(prevNode!=null)
        {
            if(prevNode.val>=root.val)
            {
                 flag=false;
            }
        }
        prevNode=root;
        
        inorder(root.right);
        
    }
}