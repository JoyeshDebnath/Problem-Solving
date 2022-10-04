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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return findPath(root,targetSum);
    }
    
    boolean findPath(TreeNode root,int target){
        
        // if(target<0)
        //       return false;
        
        if(root==null)
               return false;
        
        //if the node is leaf then this val must be eql to target val
        if(root.left==null && root.right==null)
              return (root.val==target);
        
        return findPath(root.left,target-root.val) ||  findPath(root.right,target-root.val);
        
    }
}