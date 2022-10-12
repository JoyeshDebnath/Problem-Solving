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
    public void flatten(TreeNode root) {
        
         flattenUtil(root);
         // return root;
    }
    
    void flattenUtil(TreeNode root)
    {
        if(root==null)
               return ;
        
        if(root.left==null && root.right==null)
            return ;
        
       
         
        if(root.left!=null){
             flattenUtil(root.left);
            TreeNode tempRight=root.right;
            // root.right=null;
            root.right=root.left;
            root.left=null;
            TreeNode curr=root;
            while(curr.right!=null)
                   curr=curr.right;
            curr.right=tempRight;
            root=curr;
        }
        flattenUtil(root.right);
        return;
        
    }
}