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
    int currSum=0;
    
    public TreeNode bstToGst(TreeNode root) {
        solve(root);
        return root;
    }
    
    public void solve(TreeNode root)
    {
        if(root==null)
              return;
        
        if(root.right!=null)
                   solve(root.right);
        
        currSum+=root.val;
        root.val=currSum;
        
        if(root.left!=null)
                 solve(root.left);
                  
    }
    
}